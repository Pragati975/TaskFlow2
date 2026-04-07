package com.pragati.taskflow.features.host.data

import com.pragati.taskflow.model.Theme
import kotlinx.coroutines.flow.Flow

interface IHostEnvironment {
    fun getTheme(): Flow<Theme>
}
