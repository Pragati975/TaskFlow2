package com.pragati.taskflow.features.localized.setting.ui

import androidx.compose.runtime.Immutable
import com.pragati.taskflow.model.Language

@Immutable
data class LocalizedSettingState(val items: List<LanguageItem> = listOf())

data class LanguageItem(
    val title: Int,
    val language: Language,
    val applied: Boolean
)
