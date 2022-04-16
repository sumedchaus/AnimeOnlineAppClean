package com.cs.animeonlineappclean.presentation

import com.cs.animeonlineappclean.domain.model.AnimeData

data class AnimeListState(

    val isLoading: Boolean = false,
    val animeList: List<AnimeData> = emptyList(),
    val error: String = ""

)
