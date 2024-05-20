package com.hq.quanhqph33420_lab4.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hq.quanhqph33420_lab4.R

@Composable
fun SignInScreen(navController: NavController) {
    FormView(navController = navController)
}

@Composable
fun FormView(navController: NavController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dn),
                contentDescription = "dn",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight(0.25f)
                    .padding(0.dp, 20.dp, 0.dp, 0.dp)
            )
            Text(
                text = "Welcome back",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Sign in to continue",
                modifier = Modifier.padding(0.dp, 5.dp, 0.dp, 10.dp)
            )
            Column(
                modifier = Modifier.fillMaxWidth(0.9f)
            ) {
                OutlinedTextField(
                    value = username,
                    onValueChange = { newText -> username = newText },
                    label = { Text(text = "Username") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 5.dp),
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { newText -> password = newText },

                    label = { Text(text = "Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 5.dp, 0.dp, 20.dp),
                    visualTransformation = PasswordVisualTransformation()
                )
                Button(
                    onClick = {
                        if (username.isNotEmpty() || password.isNotEmpty()) {
                            Toast.makeText(
                                context,
                                "Sign In complete!",
                                Toast.LENGTH_SHORT
                            ).show()
                            navController.navigate("listtodo")
                        } else {
                            Toast.makeText(
                                context,
                                "Username or Password not empty!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 10.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(text = "List Todo")
                }
                Button(
                    onClick = {
                        if (username.isNotEmpty() || password.isNotEmpty()) {
                            Toast.makeText(
                                context,
                                "Sign In complete!",
                                Toast.LENGTH_SHORT
                            ).show()
                            navController.navigate("listimg")
                        } else {
                            Toast.makeText(
                                context,
                                "Username or Password not empty!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 10.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(text = "List Image")
                }
            }
        }
    }
}

@Preview
@Composable
fun GreetingReview() {
    Surface(
        modifier = Modifier
            .background(Color.White)
    ) {

    }
}