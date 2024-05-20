package com.hq.quanhqph33420_lab4.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.hq.quanhqph33420_lab4.R

@Composable
fun ListImage() {
    val listItem = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5
    )
    ListItem(list = listItem)
}

@Composable
fun ListItem(list: List<Int>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(list) { item: Int ->
            Image(
                painter = painterResource(id = item), contentDescription = "item $item",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(0.dp, 10.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
    ) {
        items(list) { item: Int ->
            Image(
                painter = painterResource(id = item), contentDescription = "item $item",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                contentScale = ContentScale.Crop
            )
        }
    }

}