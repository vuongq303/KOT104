package com.hq.myapplication1

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.TextField
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hq.myapplication1.data.User
import com.hq.myapplication1.data.UserDb
import com.hq.myapplication1.data.UserFactory
import com.hq.myapplication1.data.UserReponsitory
import com.hq.myapplication1.data.UserViewModel

@Composable
fun MainApp() {
    val userRepository =
        UserReponsitory(UserDb.getDatabase(context = LocalContext.current).userDao())
    val userViewModel: UserViewModel = viewModel(factory = UserFactory(userRepository))
    val userList by userViewModel.getAllUser.observeAsState(initial = emptyList())
    val update = "Update"
    val add = "Add"
    var name by remember {
        mutableStateOf("")
    }
    var id by remember {
        mutableIntStateOf(0)
    }
    var change by remember {
        mutableStateOf(add)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = name, onValueChange = { name = it },
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .padding(0.dp, 0.dp, 10.dp, 0.dp),
                label = { Text(text = "Name") }
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Button(
                    colors = androidx.compose.material.ButtonDefaults.buttonColors(Color.Transparent),
                    onClick = {
                        when (change) {
                            add -> userViewModel.addUser(User(0, name))
                            update -> userViewModel.updateUser(User(id, name))
                        }
                        name = ""
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = change)
                }
                Button(
                    colors = androidx.compose.material.ButtonDefaults.buttonColors(Color.Transparent),
                    onClick = { name = "";change = add },
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "Quit")
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn {
            items(userList) { item ->
                Column {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, Color.Black, RoundedCornerShape(5.dp))
                    ) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(0.6f),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Id: ${item.id}", modifier = Modifier.padding(5.dp))
                            Text(text = "Name: ${item.name}", modifier = Modifier.padding(5.dp))
                        }
                        Spacer(modifier = Modifier.height(5.dp))
                        Row {
                            Spacer(modifier = Modifier.width(5.dp))
                            Button(onClick = { change = "Update";name = item.name;id = item.id }) {
                                Text(text = "Update", color = Color.White)
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            Button(onClick = {
                                userViewModel.deleteUser(
                                    User(
                                        item.id,
                                        item.name
                                    )
                                )
                            }) {
                                Text(text = "Delete", color = Color.White)
                            }
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }
}