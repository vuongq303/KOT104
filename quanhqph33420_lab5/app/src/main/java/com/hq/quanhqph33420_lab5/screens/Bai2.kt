package com.hq.quanhqph33420_lab5.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hq.quanhqph33420_lab5.R

@Composable
fun Bai2() {
    Box(modifier = Modifier.fillMaxSize()) {
        var state by remember {
            mutableStateOf(false)
        }
        Box(modifier = Modifier.align(Alignment.TopCenter)) {
            Image(
                painterResource(id = R.drawable.blub_off), contentDescription = "",
                modifier = Modifier
                    .height(300.dp)
                    .width(200.dp),
                contentScale = ContentScale.Crop
            )
            if (state) {
                Image(
                    painterResource(id = R.drawable.blub_on), contentDescription = "",
                    modifier = Modifier
                        .height(300.dp)
                        .width(200.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Switch(
            checked = state, onCheckedChange = { state = it }, modifier = Modifier.align(
                Alignment.Center
            )
        )
    }
}