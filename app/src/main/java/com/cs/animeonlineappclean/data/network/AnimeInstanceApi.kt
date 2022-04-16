package com.cs.animeonlineappclean.data.network

import com.cs.animeonlineappclean.data.model.dto.AnimeDTO
import retrofit2.Response
import retrofit2.http.GET

interface AnimeInstanceApi {


    @GET("v1/anime")
    suspend fun getAnimeList() : AnimeDTO
}