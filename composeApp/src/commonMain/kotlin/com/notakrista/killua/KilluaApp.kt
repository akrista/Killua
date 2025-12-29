package com.notakrista.killua

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.notakrista.killua.presentation.viewmodel.AuthViewModel
import com.notakrista.killua.data.repository.UserRepositoryImpl
import com.notakrista.killua.presentation.screen.LoginScreen
import com.notakrista.killua.presentation.screen.RegisterScreen
import com.notakrista.killua.presentation.screen.OnboardingScreen
import com.notakrista.killua.presentation.screen.HomeScreen
import com.notakrista.killua.presentation.screen.FirstVisitOnboardingScreen
import com.notakrista.killua.presentation.screen.PostRegistrationOnboardingScreen

@Composable
fun KilluaApp() {
    val authViewModel: AuthViewModel = viewModel { AuthViewModel(UserRepositoryImpl()) }
    val uiState by authViewModel.uiState.collectAsState()
    
    // Determine which screen to show
    val currentUser = uiState.currentUser
    when {
        // Show first visit onboarding for new users
        currentUser != null && currentUser.isFirstTimeVisit -> {
            FirstVisitOnboardingScreen(
                onOnboardingCompleted = {
                    // Navigation will be handled by LaunchedEffect in FirstVisitOnboardingScreen
                }
            )
        }
        
        // Show post-registration onboarding if user exists but hasn't completed it
        currentUser != null && !currentUser.isOnboardingCompleted -> {
            PostRegistrationOnboardingScreen(
                onOnboardingCompleted = {
                    // Navigation will be handled by LaunchedEffect in PostRegistrationOnboardingScreen
                }
            )
        }
        
        // Show login/register flow if not logged in
        !uiState.isLoggedIn -> {
            AuthFlow(
                onAuthSuccess = {
                    // Navigation will be handled by LaunchedEffect in LoginScreen/RegisterScreen
                }
            )
        }
        
        // Show home screen if logged in and all onboarding completed
        else -> {
            HomeScreen(
                onNavigateToLogin = {
                    authViewModel.logout()
                },
                onNavigateToProfile = {
                    // TODO: Navigate to profile screen
                }
            )
        }
    }
}

@Composable
private fun AuthFlow(
    onAuthSuccess: () -> Unit
) {
    var currentScreen by remember { mutableStateOf(AuthScreen.Login) }
    
    when (currentScreen) {
        AuthScreen.Login -> {
            LoginScreen(
                onLoginSuccess = onAuthSuccess,
                onNavigateToRegister = {
                    currentScreen = AuthScreen.Register
                }
            )
        }
        
        AuthScreen.Register -> {
            RegisterScreen(
                onRegisterSuccess = onAuthSuccess,
                onNavigateToLogin = {
                    currentScreen = AuthScreen.Login
                }
            )
        }
    }
}

private enum class AuthScreen {
    Login,
    Register
}
