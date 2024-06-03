package com.hq.quanhqph33420_lab7.ui.screens.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.hq.quanhqph33420_lab7.model.Movie
import com.hq.quanhqph33420_lab7.data.SourceApp

@Composable
fun ListColumn() {
    LazyColumn {
        items(SourceApp.data) { item -> ItemColumn(item = item) }
    }
}

@Composable
private fun ItemColumn(item: Movie) {
    Card(modifier = Modifier.padding(10.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            AsyncImage(
                model = item.img,
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(0.5f)
                    .padding(10.dp),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "Name: " + item.name, maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(10.dp, 10.dp, 0.dp, 0.dp)
                )
                Text(
                    text = "Time: " + item.time, maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(10.dp, 10.dp, 0.dp, 0.dp)
                )
                Text(
                    text = "Type: " + item.type, maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(10.dp, 10.dp, 0.dp, 0.dp)
                )
                Text(
                    text = "Description: " + item.description, maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(10.dp, 10.dp, 0.dp, 10.dp)
                )
            }
        }
    }
}