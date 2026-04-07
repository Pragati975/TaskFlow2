package com.pragati.taskflow.foundation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class StatefulViewModel<STATE, EFFECT, ACTION, ENVIRONMENT>(
    initialState: STATE,
    val environment: ENVIRONMENT
) : ViewModel() {

    private val _state = MutableStateFlow(initialState)
    val state: StateFlow<STATE> = _state.asStateFlow()

    private val _effect = MutableStateFlow<EFFECT?>(null)
    val effect: StateFlow<EFFECT?> = _effect.asStateFlow()

    protected fun setState(reducer: STATE.() -> STATE) {
        _state.value = _state.value.reducer()
    }

    protected fun setEffect(effect: EFFECT) {
        _effect.value = effect
    }

    fun resetEffect() {
        _effect.value = null
    }

    abstract fun dispatch(action: ACTION)
}
