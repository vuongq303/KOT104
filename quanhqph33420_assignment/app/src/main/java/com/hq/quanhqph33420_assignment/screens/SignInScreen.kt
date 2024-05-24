package com.hq.quanhqph33420_assignment.screens

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hq.quanhqph33420_assignment.R
import com.hq.quanhqph33420_assignment.font.GoogleFont

@Composable
fun SignInScreen(navController: NavController) {
    ComponentSignIn(navController = navController)
}


@Composable
fun ComponentSignIn(modifier: Modifier = Modifier, navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier
                .fillMaxWidth()
                .fillMaxHeight(0.15f),
            verticalAlignment = Alignment.Bottom,
        ) {
            Divider(
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth(0.45f)
                    .padding(20.dp),
                color = Color(0xFFBDBDBD)
            )
            Row(
                modifier.border(
                    1.dp,
                    Color.Black, RoundedCornerShape(100.dp)
                )
            ) {
                Icon(
                    painterResource(id = R.drawable.sofa), contentDescription = "",
                    modifier
                        .size(40.dp)
                        .padding(5.dp)
                )
            }
            Divider(
                thickness = 1.dp,
                modifier = Modifier
                    .padding(20.dp), color = Color(0xFFBDBDBD)
            )
        }
        Text(
            text = "Hello !", modifier.padding(10.dp),
            fontSize = 30.sp,
            color = Color(0xFF909090),
            fontFamily = GoogleFont.MerriweatherFont,
            fontWeight = FontWeight(400)
        )
        Text(
            text = "WELCOME BACK",
            fontSize = 24.sp,
            modifier = Modifier.padding(10.dp, 0.dp),
            fontWeight = FontWeight(700),
            color = Color(0xFF303030),
            fontFamily = GoogleFont.MerriweatherFont
        )
        Spacer(modifier.height(20.dp))
        Card(
            modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth()
                .padding(0.dp, 0.dp, 20.dp, 0.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(modifier.fillMaxHeight(0.4f), verticalArrangement = Arrangement.Center) {
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 0.dp, 0.dp, 0.dp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    )
                )
                Spacer(modifier.height(20.dp))
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp, 0.dp, 0.dp, 0.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    )
                )
            }
            Text(
                text = "Forgot Password",
                modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp, 0.dp, 0.dp),
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                fontFamily = GoogleFont.NunitoSansFont
            )
            Column(modifier.fillMaxHeight(0.8f), verticalArrangement = Arrangement.Center) {
                Button(
                    onClick = { navController.navigate("home") },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "Log in",
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        fontFamily = GoogleFont.NunitoSansFont
                    )
                }
                Spacer(modifier.height(20.dp))
                ClickableText(
                    text = AnnotatedString("SIGN UP"),
                    onClick = {
                        navController.navigate("signup")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(400),
                        fontFamily = GoogleFont.NunitoSansFont
                    )
                )
            }
        }
    }
}