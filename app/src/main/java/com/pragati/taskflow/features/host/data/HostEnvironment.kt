package com.pragati.taskflow.features.host.data

import com.pragati.taskflow.foundation.datasource.preference.provider.ThemeProvider
import com.pragati.taskflow.model.Theme
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HostEnvironment @Inject constructor(
    private val themeProvider: ThemeProvider
) : IHostEnvironment {

    override fun getTheme(): Flow<Theme> {
        return themeProvider.getTheme()
    }

}
