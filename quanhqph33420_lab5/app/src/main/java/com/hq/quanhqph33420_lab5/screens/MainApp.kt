package com.hq.quanhqph33420_lab5.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "bt") {
        composable("bt") {
            BTLab5(navController = navController)
        }
        composable("b1") {
            Bai1()
        }
        composable("b2") {
            Bai2()
        }
        composable("b3") {
            Bai3()
        }
    }
}