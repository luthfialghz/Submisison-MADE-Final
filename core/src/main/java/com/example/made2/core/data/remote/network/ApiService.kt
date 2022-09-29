package com.example.made2.core.data.remote.network

import com.example.made2.core.data.remote.response.SearchResponse
import com.example.made2.core.data.remote.response.DetailResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("anime")
    suspend fun getSearchAnime(
        @Query("filter[text]") query: String
    ): SearchResponse

    @GET("anime/{id}")
    suspend fun getDetailAnime(
        @Path("id") id: String,
    ): DetailResponse
}