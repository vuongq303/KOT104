package com.hq.quanhqph33420_assignment.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hq.quanhqph33420_assignment.font.GoogleFont

@Composable
fun NotificationBottomScreen(modifier: Modifier = Modifier, navController: NavController) {
    Column(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        HeaderToolBar(navController = navController, title = "Notification")
    }
}

@Composable
private fun HeaderToolBar(
    navController: NavController,
    title: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(
                Icons.Default.Search,
                contentDescription = "",
            )
        }
        Text(
            text = title,
            modifier = Modifier.fillMaxWidth(0.7f),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(700),
            fontSize = 16.sp,
            fontFamily = GoogleFont.MerriweatherFont
        )
        Spacer(modifier.fillMaxWidth(0.35f))
    }
}