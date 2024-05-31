package com.hq.quanhqph33420_lab6.screens

import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Bai2() {
    val alphabets = ('A'..'L').toMutableList()
    val numbers = (1..8).toMutableList()
    val context = LocalContext.current

    val listSelected = remember { mutableListOf<String>() }
    val listBooked = remember { mutableListOf<String>() }

    Surface(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.padding(5.dp)) {
            items(alphabets) { alphabetsItem ->
                LazyRow(modifier = Modifier.fillMaxWidth()) {
                    items(numbers) { numbersItems ->
                        val cardColors = when {
                            listSelected.contains("$alphabetsItem$numbersItems") -> Color.Yellow
                            listBooked.contains("$alphabetsItem$numbersItems") -> Color.Green
                            else -> Color.White
                        }
                        Card(
                            modifier = Modifier
                                .size(40.dp)
                                .padding(5.dp)
                                .border(1.dp, Color.Black, RoundedCornerShape(5.dp))
                                .clickable {
                                    if (listSelected.contains("$alphabetsItem$numbersItems")) {
                                        listBooked.add("$alphabetsItem$numbersItems")
                                        listBooked.remove("$alphabetsItem$numbersItems")
                                    } else if (listBooked.contains("$alphabetsItem$numbersItems")) {
                                        Toast
                                            .makeText(context, "Booked", Toast.LENGTH_SHORT)
                                            .show()
                                    } else {
                                        listSelected.add("$alphabetsItem$numbersItems")
                                    }
                                },
                            colors = CardDefaults.cardColors(cardColors)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Text(text = "$alphabetsItem$numbersItems")
                            }
                        }
                        if (numbersItems == 4) {
                            Spacer(modifier = Modifier.size(40.dp))
                        }
                    }
                }
                if (alphabetsItem == 'E') {
                    Spacer(modifier = Modifier.size(40.dp))
                }
            }
        }
    }
}