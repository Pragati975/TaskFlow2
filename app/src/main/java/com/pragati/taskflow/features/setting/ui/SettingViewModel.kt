package com.pragati.taskflow.features.setting.ui

import com.pragati.taskflow.foundation.viewmodel.StatefulViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor() :
    StatefulViewModel<SettingState, Unit, Unit, Unit>(SettingState(), Unit) {

    override fun dispatch(action: Unit) {
    }

}
