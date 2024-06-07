package com.hq.quanhqph33420_lab8.component.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.hq.quanhqph33420_lab8.model.Phim

@Composable
fun ItemRow(item: Phim) {
    Card(modifier = Modifier.padding(10.dp)) {
        Column(modifier = Modifier.width(200.dp)) {
            AsyncImage(
                model = item.img,
                contentDescription = null,
                modifier = Modifier
                    .height(400.dp)
                    .fillMaxWidth()
                    .padding(10.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Name: " + item.name, maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)
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