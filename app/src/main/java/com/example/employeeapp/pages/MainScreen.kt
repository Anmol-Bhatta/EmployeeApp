package com.example.employeeapp.pages

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.employeeapp.AuthViewModel
import com.example.employeeapp.ProfileViewModel

@Composable
fun MainScreen(authViewModel: AuthViewModel, profileViewModel: ProfileViewModel,modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = "home", Modifier.padding(innerPadding)) {
            composable("home") { HomePage(navController = navController, authViewModel = authViewModel) }
            composable("profile") { ProfilePage(navController = navController, profileViewModel = profileViewModel) }
            composable("eventManagement") { EventManagementPage(navController = navController) }
            composable("volunteerMatching") { VolunteerMatchingPage(navController = navController) }
            composable("notifications") { NotificationsPage(navController = navController) }
            composable("history") { HistoryPage(navController = navController) }
        }
    }
}
