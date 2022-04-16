package com.cs.animeonlineappclean.data.repository

import com.cs.animeonlineappclean.data.model.dto.AnimeDTO
import com.cs.animeonlineappclean.data.network.AnimeInstanceApi
import com.cs.animeonlineappclean.domain.repository.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImplementation @Inject constructor(private val api :AnimeInstanceApi)
    :AnimeRepository
{
    override suspend fun getAnimeList(): AnimeDTO {
        return api.getAnimeList()
    }

}