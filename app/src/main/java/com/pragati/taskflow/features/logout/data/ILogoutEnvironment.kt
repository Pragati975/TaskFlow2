package com.pragati.taskflow.features.logout.data

import com.pragati.taskflow.model.User
import kotlinx.coroutines.flow.Flow

interface ILogoutEnvironment {
    suspend fun logout()
    fun getUser(): Flow<User>
}
