package com.hq.quanhqph33420_lab6

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hq.quanhqph33420_lab6.screens.Bai1
import com.hq.quanhqph33420_lab6.screens.Bai2
import com.hq.quanhqph33420_lab6.screens.MainScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "bt") {
        composable("bt") {
            MainScreen(navController)
        }
        composable("b1") {
            Bai1()
        }
        composable("b2") {
            Bai2()
        }
    }
}