package com.example.employeeapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.employeeapp.pages.*

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel, profileViewModel: ProfileViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginPage(navController = navController, authViewModel = authViewModel) }
        composable("signup") { SignupPage(navController = navController, authViewModel = authViewModel) }
        composable("home") { HomePage(navController = navController, authViewModel = authViewModel) }
    }
}


