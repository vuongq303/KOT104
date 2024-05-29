package com.hq.quanhqph33420_lab5.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun BTLab5(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navController.navigate("b1") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Bai 1")
        }
        Button(onClick = { navController.navigate("b2") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Bai 2")
        }
        Button(onClick = { navController.navigate("b3") }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Bai 3")
        }
    }
}