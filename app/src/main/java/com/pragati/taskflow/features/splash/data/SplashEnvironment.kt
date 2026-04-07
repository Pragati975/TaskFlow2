package com.pragati.taskflow.features.splash.data

import com.pragati.taskflow.foundation.datasource.preference.provider.CredentialProvider
import com.pragati.taskflow.model.Credential
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SplashEnvironment @Inject constructor(
    private val credentialProvider: CredentialProvider
) : ISplashEnvironment {

    override fun getCredential(): Flow<Credential> {
        return credentialProvider.getCredential()
    }

}
