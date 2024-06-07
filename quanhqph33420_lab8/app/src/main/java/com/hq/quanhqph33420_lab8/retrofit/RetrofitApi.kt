package com.hq.quanhqph33420_lab8.retrofit

import com.hq.quanhqph33420_lab8.model.MovieResponse
import com.hq.quanhqph33420_lab8.model.Phim
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitApi {
    @GET("/")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}