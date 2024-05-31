package com.hq.quanhqph33420_lab6.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.hq.quanhqph33420_lab6.screens.component.ListColumn
import com.hq.quanhqph33420_lab6.screens.component.ListGrid
import com.hq.quanhqph33420_lab6.screens.component.ListRow

@Composable
fun Bai1() {
    var row by remember {
        mutableStateOf(false)
    }
    var column by remember {
        mutableStateOf(false)
    }
    var grid by remember {
        mutableStateOf(false)
    }
    Column {
        Row {
            Button(onClick = { row = true;column = false;grid = false }) {
                Text(text = "Row")
            }
            Button(onClick = { row = false;column = true;grid = false }) {
                Text(text = "Column")
            }
            Button(onClick = { row = false;column = false;grid = true }) {
                Text(text = "Grid")
            }
        }
        RenderList(row = row, column = column, grid = grid)
    }
}

@Composable
fun RenderList(row: Boolean, column: Boolean, grid: Boolean) {
    when {
        row -> ListRow()
        column -> ListColumn()
        grid -> ListGrid()
    }

}