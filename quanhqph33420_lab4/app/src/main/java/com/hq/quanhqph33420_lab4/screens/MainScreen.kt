package com.hq.quanhqph33420_lab4.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "signin") {
        composable("signin") {
            SignInScreen(navController = navController)
        }
        composable("listimg") {
            ListImage()
        }
        composable("listtodo") {
            ListTodo()
        }
    }

}