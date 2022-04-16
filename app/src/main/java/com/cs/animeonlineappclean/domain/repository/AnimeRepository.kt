package com.cs.animeonlineappclean.domain.repository

import com.cs.animeonlineappclean.data.model.dto.AnimeDTO

interface AnimeRepository {

    suspend fun getAnimeList() : AnimeDTO
}