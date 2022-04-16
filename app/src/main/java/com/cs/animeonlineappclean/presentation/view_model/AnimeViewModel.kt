package com.cs.animeonlineappclean.presentation.view_model

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cs.animeonlineappclean.domain.use_case.AnimeGetUseCase
import com.cs.animeonlineappclean.presentation.AnimeListState
import com.cs.newsappcleanarchvisionandroid.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeGetUseCase: AnimeGetUseCase
) :ViewModel() {

    private val stateAnime = mutableStateOf(AnimeListState())
    val state : State<AnimeListState> = stateAnime

    init {
        getAnimeList()
    }

    private fun getAnimeList() {
        animeGetUseCase().onEach {
            when(it){
                is Resource.Loading ->{
                    stateAnime.value = AnimeListState(isLoading = true)
                }
                is Resource.Success -> {
                    stateAnime.value = AnimeListState(animeList = it.data ?: emptyList())
                }
                is Resource.Error -> {
                    stateAnime.value = AnimeListState(error = it.message ?: "An Unexpected Error")
                }
            }
        }.launchIn(viewModelScope)
    }
}