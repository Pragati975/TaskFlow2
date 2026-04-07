package com.pragati.taskflow.features.login.ui

sealed class LoginEffect {
    object NavigateToDashboard : LoginEffect()
}
