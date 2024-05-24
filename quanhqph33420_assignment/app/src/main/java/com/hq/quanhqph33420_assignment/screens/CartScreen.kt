package com.hq.quanhqph33420_assignment.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Minimize
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.hq.quanhqph33420_assignment.font.GoogleFont
import com.hq.quanhqph33420_assignment.model.ProductModel

@Composable
fun CartScreen(navController: NavController) {
    ComponentCart(navController = navController)
}

@Composable
private fun ListItemCart() {
    val itemsList = listOf(
        ProductModel(
            "1",
            "name1",
            "https://static.remove.bg/sample-gallery/graphics/bird-thumbnail.jpg",
            40,
            5
        ),
        ProductModel(
            "2",
            "namure1",
            "https://static.remove.bg/sample-gallery/graphics/bird-thumbnail.jpg",
            40,
            5
        ),
        ProductModel(
            "3",
            "narume1",
            "https://static.remove.bg/sample-gallery/graphics/bird-thumbnail.jpg",
            40,
            5
        ),
        ProductModel(
            "4",
            "name6u1",
            "https://static.remove.bg/sample-gallery/graphics/bird-thumbnail.jpg",
            40,
            5
        ),
    )
    LazyColumn {
        items(itemsList) { item ->
            ItemCard(item = item)
        }
    }
}

@Composable
private fun ItemCard(item: ProductModel, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Card(modifier = Modifier.size(100.dp)) {
            AsyncImage(
                model = item.imgProduct,
                contentDescription = item.id,
                contentScale = ContentScale.Crop
            )
        }
        Column(modifier = Modifier.fillMaxWidth(0.9f)) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = item.nameProduct,
                    fontFamily = GoogleFont.NunitoSansFont,
                    fontWeight = FontWeight(600),
                    fontSize = 14.sp,
                    color = Color(0xFF999999)
                )
                Surface(
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier
                        .size(20.dp)
                        .fillMaxWidth(),
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.background(Color.White)
                    ) {
                        Icon(
                            Icons.Default.Clear,
                            contentDescription = "",
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }
            }
            Text(
                text = "$ ${item.priceProduct}",
                fontFamily = GoogleFont.NunitoSansFont,
                fontWeight = FontWeight(700),
                fontSize = 16.sp,
                color = Color(0xFF242424)
            )
            Row(
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.fillMaxHeight()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier.size(30.dp),
                        shape = RoundedCornerShape(5.dp),
                        colors = CardDefaults.cardColors(
                            Color(0xFFE0E0E0)
                        )
                    ) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Default.Add, contentDescription = null)
                        }
                    }
                    Spacer(modifier.width(10.dp))
                    Text(
                        text = "01",
                        fontFamily = GoogleFont.NunitoSansFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF242424)
                    )
                    Spacer(modifier.width(10.dp))
                    Card(modifier.size(30.dp), shape = RoundedCornerShape(5.dp)) {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                Icons.Filled.RemoveCircleOutline,
                                contentDescription = null,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ComponentCart(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column {
            Row(
                modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Default.KeyboardArrowLeft,
                        contentDescription = "",
                    )
                }
                Text(
                    text = "My Cart",
                    modifier = Modifier.fillMaxWidth(0.7f),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight(700),
                    fontSize = 16.sp,
                    fontFamily = GoogleFont.MerriweatherFont
                )
                Spacer(modifier.fillMaxWidth(0.35f))
            }
            ListItemCart()
        }
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(10.dp),
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .height(45.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(0.85f),
                    colors = CardDefaults.cardColors(
                        Color.White,
                    ), elevation = CardDefaults.elevatedCardElevation()
                ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text(text = "Enter your promo code") },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.White,
                            focusedContainerColor = Color.White
                        )
                    )
                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(
                        Color(0xFF303030),
                    ),
                ) {
                    IconButton(
                        onClick = { /*TODO*/ },
                        colors = IconButtonDefaults.iconButtonColors(
                            Color(0xFF303030),
                        ),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Icon(
                            Icons.Filled.ArrowForwardIos,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                }
            }
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Total:",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    fontFamily = GoogleFont.NunitoSansFont
                )
                Text(
                    text = "$44",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(700),
                    fontFamily = GoogleFont.NunitoSansFont
                )
            }
            Button(
                onClick = { /*TODO*/ }, shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF242424))
            ) {
                Text(
                    text = "Check out",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    fontFamily = GoogleFont.NunitoSansFont
                )
            }
        }
    }
}

