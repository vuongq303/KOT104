package com.hq.quanhqph33420_lab7.ui.screens.component


import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.hq.quanhqph33420_lab7.data.SourceApp
import com.hq.quanhqph33420_lab7.ui.screens.component.component.ItemRow

@Composable
fun ListRow() {
    LazyRow {
        items(SourceApp.data) { item ->
            ItemRow(item = item)
        }
    }
}