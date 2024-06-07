package com.hq.quanhqph33420_lab8

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hq.quanhqph33420_lab8.model.Phim
import com.hq.quanhqph33420_lab8.model.toMovie
import com.hq.quanhqph33420_lab8.retrofit.RetrofitService
import kotlinx.coroutines.launch

class MovieViewModel : ViewModel() {
    private val _movies = MutableLiveData<List<Phim>>()
    val movies: LiveData<List<Phim>> = _movies

    init {
        getMovies()
    }

    fun getMovies() {
        viewModelScope.launch {
            try {
                val response = RetrofitService().movieService.getListFilms()
                if (response.isSuccessful) {
                    _movies.postValue(response.body()?.map { it.toMovie() })
                } else {
                    _movies.postValue(emptyList())
                }
            } catch (e: Exception) {
                Log.e("TAG", "getMovies: " + e.message)
                _movies.postValue(emptyList())
            }
        }
    }
}