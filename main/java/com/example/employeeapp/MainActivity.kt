package com.example.employeeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.rememberCoroutineScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val snackbarHostState = SnackbarHostState()
            val scope = rememberCoroutineScope()
            MyAppNavigation(
                authViewModel = AuthViewModel(),
                profileViewModel = ProfileViewModel(),
                snackbarHostState = snackbarHostState,
                scope = scope
            )
        }
    }
}
