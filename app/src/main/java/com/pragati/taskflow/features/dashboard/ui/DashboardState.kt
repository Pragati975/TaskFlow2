package com.pragati.taskflow.features.dashboard.ui

import androidx.compose.runtime.Immutable
import com.pragati.taskflow.model.User

@Immutable
data class DashboardState(val user: User = User())
