package com.hq.quanhqph33420_assignment.src.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hq.quanhqph33420_assignment.R

class SignInScreen : ComponentActivity() {
    var username by mutableStateOf("")
    var password by mutableStateOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { }
    }

    @Composable
    fun FormView() {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dn),
                contentDescription = "dn",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(200.dp)
            )
            OutlinedTextField(
                value = username,
                onValueChange = { newText -> username = newText },
                label = { Text(text = "Username") },
                modifier = Modifier.fillMaxWidth(0.9f)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { newText -> password = newText },
                label = { Text(text = "Password") },
                modifier = Modifier.fillMaxWidth(0.9f)
            )
        }
    }

    @Composable
    fun ButtonView(modifier: Modifier = Modifier) {

    }

    @Preview
    @Composable
    fun GreetingReview() {
        Surface(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize(),
        ) {
            FormView()
            ButtonView()
        }
    }

}