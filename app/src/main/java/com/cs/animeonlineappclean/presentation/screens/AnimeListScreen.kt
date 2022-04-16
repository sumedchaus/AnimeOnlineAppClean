package com.cs.animeonlineappclean.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.cs.animeonlineappclean.presentation.view_model.AnimeViewModel

@Composable
fun AnimeListScreen(
    viewModel: AnimeViewModel = hiltViewModel(),
) {

    val animeState = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn{
            items(animeState.animeList){anime ->

                AnimeItems(anime =anime )
            }
        }

        if(animeState.error.isNotBlank()){
            Text(animeState.error, color =  Color.Red, textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .align(Alignment.Center)
                )
        }
        if (animeState.isLoading){
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }

}