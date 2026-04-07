package com.pragati.taskflow.features.logout.ui

import androidx.compose.runtime.Immutable
import com.pragati.taskflow.model.User

@Immutable
data class LogoutState(val user: User = User())
