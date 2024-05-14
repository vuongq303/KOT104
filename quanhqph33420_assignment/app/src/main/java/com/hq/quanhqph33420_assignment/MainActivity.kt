package com.hq.quanhqph33420_assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hq.quanhqph33420_assignment.ui.theme.Quanhqph33420_assignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quanhqph33420_assignmentTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
                BackgroundView()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ButtonView(onClick: () -> Unit) {
    Row(
        Modifier.padding(10.dp)
    ) {
        Button(
            onClick = {
                onClick()
            }

        ) {
            Text(
                text = "Get started",
                Modifier.padding(8.dp, 6.dp)
            )
        }
    }
}

@Composable
fun BackgroundView(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "welcome image",
            contentScale = ContentScale.Fit,
            
        )
        Text(
            text = "Họ tên: Hoàng Quốc Quân",
            modifier.run {
                padding(5.dp)
            },
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Mã sinh viên: PH33420",
            modifier.run {
                padding(5.dp)
            },
            fontWeight = FontWeight.Bold
        )
        ButtonView {

        }
    }
}


@Preview
@Composable
fun GreetingPreview() {
    Quanhqph33420_assignmentTheme {
        Surface {
            BackgroundView()
        }
    }
}