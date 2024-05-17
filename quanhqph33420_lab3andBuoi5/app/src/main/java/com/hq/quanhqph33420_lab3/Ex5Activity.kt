package com.hq.quanhqph33420_lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

var listItem = listOf(
    mapOf(
        "image" to "https://rgb.vn/wp-content/uploads/2014/05/rgb_vn_new_branding_paypal_2014_logo_detail.png",
        "name" to "PayPal",
        "color" to Color.Green
    ),
    mapOf(
        "image" to "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXI3aOZWrF2E6-nQHBKSTwQGX9P-d5bpcNhJZlITRd5Q&s",
        "name" to "Visa",
        "color" to Color.White
    ),
    mapOf(
        "image" to "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGds0dVYCpsArM9iAbJ8GNMQIHWR_M7vECi27mUxg1cQ&s",
        "name" to "Momo",
        "color" to Color.Gray
    ),
    mapOf(
        "image" to "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTW3BiEw8IpQ7BebAKvyTUtfgXwrINzFOfr_L8LbOX74A&s",
        "name" to "Zalo Pay",
        "color" to Color.Cyan
    ),
    mapOf(
        "image" to "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_qQtoEfKT-A12LWy3KTbgxHq_rEzA9iDgbkICHqqlvw&s",
        "name" to "Thanh toán trực tiếp",
        "color" to Color.Magenta
    )
)

class Ex5Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                HeaderView()
                BodyView(listItem)
                Spacer(modifier = Modifier.height(20.dp))
                BottomNavigation()
            }
        }
    }
}

@Composable
fun HeaderView() {
    Column {
        Text(
            text = "Thanh toán",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp)
        )
        Divider(thickness = 2.dp, color = Color.White)
        Text(
            text = "Địa chỉ nhận hàng",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(10.dp)
        )
        Row(
            modifier = Modifier.padding(20.dp, 0.dp, 0.dp, 0.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.locationimg),
                contentDescription = "Image location",
                modifier = Modifier.width(50.dp)
            )
            Column {
                Text(text = "Trị | 2222", color = Color.White)
                Text(text = "22/333 đường Trung Mỹ Tây 1", color = Color.White)
                Text(text = "phường Tân Thới Nhất", color = Color.White)
                Text(text = "quận 12, Thành phố Hồ Chí Minh", color = Color.White)
            }
        }
        Text(
            text = "Vui lòng chọn một trong các phương thức sau:",
            modifier = Modifier.padding(20.dp),
            color = Color.White,
        )

    }
}

@Composable
fun BodyView(listItems: List<Map<String, Any>>) {
    Column(
        modifier = Modifier
            .padding(10.dp, 0.dp)
    ) {
        LazyColumn(modifier = Modifier.fillMaxHeight(0.7f)) {
            items(listItems) { item ->
                RowItem(item)
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(20.dp),

            ) {
            Text(text = "Tiếp theo")
        }
    }
}

@Composable
fun RowItem(item: Map<String, Any>) {
    Card(shape = RoundedCornerShape(20.dp)) {
        Row(
            modifier = Modifier
                .background(item["color"] as Color)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = item["image"],
                contentDescription = "image",
                modifier = Modifier
                    .size(70.dp)
                    .padding(10.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = item["name"] as String,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(20.dp, 0.dp, 0.dp, 0.dp)
            )
            RadioButton(
                selected = false,
                onClick = {},
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun BottomNavigation() {
    Scaffold(bottomBar = {
        BottomAppBar(
            contentColor = Color.White,
            containerColor = Color.Black,
            actions = {
                Row {
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxWidth(0.25f)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Filled.Home,
                                contentDescription = ""
                            )
                            Text(text = "Trang chủ")
                        }
                    }
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxWidth(0.33f)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Filled.DateRange,
                                contentDescription = ""
                            )
                            Text(text = "Lịch sử")
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(0.5f)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Filled.ShoppingCart,
                                contentDescription = ""
                            )
                            Text(text = "Giỏ hàng")
                        }
                    }
                    IconButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Filled.Person,
                                contentDescription = ""
                            )
                            Text(text = "Hồ sơ")
                        }
                    }
                }
            },
        )
    }) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = ""
        )
    }

}

@Preview
@Composable
fun GreetingView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x10000000))
    ) {
        HeaderView()
        BodyView(listItem)
        BottomNavigation()
    }
}
