package com.hq.quanhqph33420_assignment.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.outlined.Logout
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hq.quanhqph33420_assignment.R
import com.hq.quanhqph33420_assignment.bottom_nav.Screens
import com.hq.quanhqph33420_assignment.font.GoogleFont
import com.hq.quanhqph33420_assignment.ui.component.DialogConfirm

@Composable
fun UserScreen(modifier: Modifier = Modifier,navController:NavController) {
    var dialogConfirm by remember {
        mutableStateOf(false)
    }
    when {
        dialogConfirm -> DialogConfirm(
            onDismissRequest = { dialogConfirm = false },
            onConfirmation = {
                navController.navigate(Screens.signin) {
                    popUpTo(Screens.person)
                    { inclusive = true }
                }
                dialogConfirm = false
            },
            dialogTitle = "Log out",
            dialogText = "Confirm log out"
        )
    }
    val scrollState = rememberScrollState()
    Column(
        modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(scrollState)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Outlined.Search, contentDescription = null)
            }
            Column(
                modifier.fillMaxWidth(0.5f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Profile",
                    fontFamily = GoogleFont.MerriweatherFont,
                    fontWeight = FontWeight(700),
                    fontSize = 16.sp,
                    color = Color(0xFF303030)
                )
            }
            IconButton(onClick = {
                dialogConfirm = true
            }) {
                Icon(Icons.Outlined.Logout, contentDescription = null)
            }
        }
        Row(modifier.padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painterResource(id = R.drawable.avatar_), contentDescription = "avatar",
                modifier.size(80.dp)
            )
            Spacer(modifier.width(20.dp))
            Column {
                Text(
                    text = "Bruno Pham",
                    fontWeight = FontWeight(700),
                    fontSize = 20.sp,
                    fontFamily = GoogleFont.NunitoSansFont,
                    color = Color(0xFF303030)
                )
                Text(
                    text = "bruno203@gmail.com",
                    fontWeight = FontWeight(400),
                    fontSize = 14.sp,
                    fontFamily = GoogleFont.NunitoSansFont,
                    color = Color(0xFF808080)
                )
            }
        }
        ItemOption(title = "My orders", content = "Already have 10 orders")
        ItemOption(title = "Shipping address", content = "03 Address")
        ItemOption(title = "Payment Method", content = "You have 2 cards")
        ItemOption(title = "My previews", content = "Preview for 5 items")
        ItemOption(title = "Setting", content = "Notification, Password, FAQ, Contact")

    }
}

@Composable
fun ItemOption(title: String, content: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 5.dp),
        elevation = CardDefaults.elevatedCardElevation(10.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),

            ) {
            Column {
                Text(
                    text = title,
                    fontWeight = FontWeight(700),
                    fontSize = 18.sp,
                    fontFamily = GoogleFont.NunitoSansFont,
                    color = Color(0xFF303030)
                )
                Text(
                    text = content,
                    fontWeight = FontWeight(400),
                    fontSize = 12.sp,
                    fontFamily = GoogleFont.NunitoSansFont,
                    color = Color(0xFF808080)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.ArrowForwardIos, contentDescription = "arrow")
            }
        }
    }
}