package com.pragati.taskflow.features.splash.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.pragati.taskflow.foundation.viewmodel.HandleEffect
import com.pragati.taskflow.runtime.navigation.AuthFlow
import com.pragati.taskflow.runtime.navigation.HomeFlow
import com.pragati.taskflow.runtime.navigation.MainFlow

@Composable
fun SplashScreen(
    navController: NavController,
    viewModel: SplashViewModel
) {
    HandleEffect(viewModel) {
        when (it) {
            SplashEffect.NavigateToDashboard -> {
                navController.navigate(HomeFlow.Root.route) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }
            SplashEffect.NavigateToLogin -> {
                navController.navigate(AuthFlow.Root.route) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }
        }
    }
}
