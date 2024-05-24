package com.hq.quanhqph33420_assignment.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AssignmentApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(navController = navController)
        }
        composable("signin") {
            SignInScreen(navController = navController)
        }
        composable("signup") {
            SignUpScreen(navController = navController)
        }
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("itemProduct") {
            ItemProduct(navController = navController)
        }
        composable("cart") {
            CartScreen(navController = navController)
        }
        composable("checkout") {
            CheckOutScreen(navController = navController)
        }
        composable("notification") {
            NotificationScreen(navController = navController)
        }
    }

}