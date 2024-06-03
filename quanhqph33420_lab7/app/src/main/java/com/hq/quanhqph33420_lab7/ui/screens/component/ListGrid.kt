package com.hq.quanhqph33420_lab7.ui.screens.component

import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import com.hq.quanhqph33420_lab7.data.SourceApp
import com.hq.quanhqph33420_lab7.ui.screens.component.component.ItemRow

@Composable
fun ListGrid() {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(2)
    ) {
        items(SourceApp.data) { item -> ItemRow(item = item) }
    }
}