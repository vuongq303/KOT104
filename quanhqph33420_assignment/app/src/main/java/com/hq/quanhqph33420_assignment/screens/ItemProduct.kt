package com.hq.quanhqph33420_assignment.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.RemoveCircleOutline
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.hq.quanhqph33420_assignment.R
import com.hq.quanhqph33420_assignment.font.GoogleFont

@Composable
fun ItemProduct(navController: NavController) {
    ComponentItemProduct(navController = navController)
}

@Composable
fun ComponentItemProduct(modifier: Modifier = Modifier, navController: NavController) {
    val scrollSate = rememberScrollState()
    Column(
        modifier
            .fillMaxSize()
            .verticalScroll(scrollSate)
    ) {
        Column {
            Box(
                modifier
                    .height(450.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.96f)
                        .align(Alignment.TopEnd)
                ) {
                    Card(
                        shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 30.dp),
                        modifier = Modifier.align(Alignment.TopEnd),
                    ) {
                        Image(
                            painterResource(id = R.drawable.welcome_img),
                            contentDescription = null,
                            modifier
                                .fillMaxWidth(0.9f),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Spacer(modifier = Modifier.height(45.dp))
                        Card(
                            shape = RoundedCornerShape(6.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            elevation = CardDefaults.elevatedCardElevation()
                        ) {
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier.size(40.dp)
                            ) {
                                Icon(Icons.Filled.KeyboardArrowLeft, contentDescription = null)
                            }
                        }
                        Spacer(modifier.height(50.dp))
                        Card(
                            shape = RoundedCornerShape(40.dp),
                            modifier = Modifier
                                .height(220.dp)
                                .width(65.dp),
                            colors = CardDefaults.cardColors(Color.White),
                            elevation = CardDefaults.elevatedCardElevation()
                        ) {
                            Row(
                                modifier.fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painterResource(id = R.drawable.cicle_it_product),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(195.dp)
                                        .width(65.dp)
                                )
                            }
                        }
                    }
                }
            }
            Column(modifier.padding(20.dp)) {
                Spacer(modifier.height(10.dp))
                Text(
                    text = "Minimal Stand",
                    fontFamily = GoogleFont.GelasioFont,
                    fontSize = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF303030)
                )
                Spacer(modifier.height(10.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "$ 50",
                        fontFamily = GoogleFont.NunitoSansFont,
                        fontSize = 30.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF303030)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
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
                            text = "01", fontFamily = GoogleFont.NunitoSansFont,
                            fontSize = 18.sp,
                            fontWeight = FontWeight(600),
                            color = Color(0xFF242424)
                        )
                        Spacer(modifier.width(10.dp))
                        Card(modifier.size(30.dp), shape = RoundedCornerShape(5.dp)) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Filled.RemoveCircleOutline, contentDescription = null)
                            }
                        }
                    }
                }
                Spacer(modifier.height(10.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painterResource(id = R.drawable.star_it),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier.width(10.dp))
                    Text(
                        text = "4.5",
                        fontFamily = GoogleFont.NunitoSansFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFF303030)
                    )
                    Spacer(modifier.width(20.dp))
                    Text(
                        text = "(50 reviews)",
                        fontFamily = GoogleFont.NunitoSansFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF808080)
                    )
                }
                Spacer(modifier.height(10.dp))

                Text(
                    text = "Minimal Stand is made of by natural wood. The design that is very simple and minimal. This is truly one of the best furnitures in any family for now. With 3 different colors, you can easily select the best match for your home.",
                    fontFamily = GoogleFont.NunitoSansFont,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(300),
                    color = Color(0xFF606060)
                )

                Spacer(modifier.height(10.dp))
                Row(
                    modifier
                        .height(60.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFF0F0F0)),
                        modifier = Modifier.width(60.dp)
                    ) {
                        Row(
                            modifier.fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(Icons.Default.DateRange, contentDescription = null)
                            }
                        }
                    }
                    Card(
                        shape = RoundedCornerShape(6.dp),
                        colors = CardDefaults.cardColors(
                            Color(0xFF242424)
                        )
                    ) {
                        Button(
                            onClick = { navController.navigate("cart") },
                            modifier
                                .fillMaxWidth(0.9f)
                                .height(60.dp),
                            colors = ButtonDefaults.buttonColors(
                                Color(0xFF242424)
                            )
                        ) {
                            Text(
                                text = "Add to cart",
                                fontFamily = GoogleFont.NunitoSansFont,
                                fontSize = 20.sp,
                                fontWeight = FontWeight(600),
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}