package com.hq.quanhqph33420_lab4.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hq.quanhqph33420_lab4.R

@Composable
fun ListTodo() {
    var listItem = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    ListItemTodo(list = listItem)
}

@Composable
fun ListItemTodo(list: List<Int>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(list) { item ->
            ItemList(item = item)
        }
    }
}

@Composable
fun ItemList(item: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp, 10.dp),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Text(text = "Item $item", modifier = Modifier.fillMaxWidth(0.9f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.ArrowDropDown, contentDescription = null)
            }
        }
    }
}

