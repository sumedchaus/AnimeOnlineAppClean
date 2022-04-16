package com.cs.animeonlineappclean.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.cs.animeonlineappclean.domain.model.AnimeData

@Composable
fun AnimeItems(
    anime: AnimeData,
    modifier: Modifier = Modifier,

    ) {
    Column(
        modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
       Text(text = "${anime.title}",
       style = MaterialTheme.typography.h6,
       overflow = TextOverflow.Ellipsis,
       color = Color.DarkGray)

        Text(text = "${anime.description}",
            style = MaterialTheme.typography.h6,
            overflow = TextOverflow.Ellipsis,
            color = Color.DarkGray)
    }


}