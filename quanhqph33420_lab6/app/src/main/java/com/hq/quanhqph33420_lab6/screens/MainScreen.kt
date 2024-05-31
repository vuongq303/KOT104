package com.hq.quanhqph33420_lab6.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column {
        Button(onClick = { navController.navigate("b1") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Bai 1")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { navController.navigate("b2") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Bai 2")
        }
    }
}