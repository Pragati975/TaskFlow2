package com.pragati.taskflow.features.splash.data

import com.pragati.taskflow.model.Credential
import kotlinx.coroutines.flow.Flow

interface ISplashEnvironment {
    fun getCredential(): Flow<Credential>
}
