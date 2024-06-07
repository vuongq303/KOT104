package com.hq.quanhqph33420_lab8.component


import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.hq.quanhqph33420_lab8.MovieViewModel
import com.hq.quanhqph33420_lab8.component.component.ItemRow

@Composable
fun ListRow() {
    val movieViewModel: MovieViewModel = viewModel()
    val moviesState = movieViewModel.movies.observeAsState(initial = emptyList())
    val movies = moviesState.value
    LazyRow {
        items(movies) { item ->
            ItemRow(item = item)
        }
    }
}