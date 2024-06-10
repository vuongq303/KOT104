package com.hq.quanhqph33420_assignment.bottom_nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hq.quanhqph33420_assignment.ui.screens.CartScreen
import com.hq.quanhqph33420_assignment.ui.screens.CheckOutScreen
import com.hq.quanhqph33420_assignment.ui.screens.FavoriteScreen
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
        composable(Screens.welcome) {
            WelcomeScreen(navController = navController)
        }
        composable(Screens.bottomApp) {
            BottomApp(navControllerMain = navController)
        }
        composable(Screens.signin) {
            SignInScreen(navController = navController)
        }
        composable(Screens.signUp) {
            SignUpScreen(navController = navController)
        }
        composable("${Screens.itemProduct}/{id}") { backStack ->
            val id = backStack.arguments?.getString("id")
            ItemProduct(
                navController = navController,
                id = id ?: ""
            )
        }
        composable(Screens.cart) {
            CartScreen(navController = navController)
        }
        composable("${Screens.checkOut}/{total}") { backStack ->
            val total = backStack.arguments?.getString("total")
            CheckOutScreen(navController = navController, total = total ?: "")
        }
        composable(Screens.notification) {
            NotificationScreen(navController = navController)
        }
        composable(Screens.home) {
            HomeScreen(navController = navController)
        }
        composable(Screens.favorite) {
            FavoriteScreen(navController = navController)
        }
    }
}