package com.pragati.taskflow.features.localized.setting.ui

import com.pragati.taskflow.model.Language

sealed class LocalizedEffect {
    data class ApplyLanguage(val language: Language) : LocalizedEffect()
}
