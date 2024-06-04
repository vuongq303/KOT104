package com.hq.quanhqph33420_assignment.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hq.quanhqph33420_assignment.ui.screens.CartScreen
import com.hq.quanhqph33420_assignment.ui.screens.CheckOutScreen
import com.hq.quanhqph33420_assignment.ui.screens.HomeScreen
import com.hq.quanhqph33420_assignment.ui.screens.ItemProduct
import com.hq.quanhqph33420_assignment.ui.screens.NotificationScreen
import com.hq.quanhqph33420_assignment.ui.screens.SignInScreen
import com.hq.quanhqph33420_assignment.ui.screens.SignUpScreen
import com.hq.quanhqph33420_assignment.ui.screens.WelcomeScreen

@Composable
fun ScreenNav() {
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
        composable("itemProduct/{id}") { backStack ->
            val id = backStack.arguments?.getString("id")
            ItemProduct(
                navController = navController,
                id = id ?: ""
            )
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