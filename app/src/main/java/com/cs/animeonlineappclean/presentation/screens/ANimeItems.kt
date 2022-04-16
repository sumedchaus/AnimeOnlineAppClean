package com.cs.animeonlineappclean.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cs.animeonlineappclean.domain.model.AnimeData

@Composable
fun AnimeItems(
    anime: AnimeData,
    modifier: Modifier = Modifier,

    ) {

    Card(
        modifier = Modifier.padding(16.dp),
        backgroundColor = Color.LightGray
    ) {
        Column(
            modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                text = "${anime.title}",
                overflow = TextOverflow.Ellipsis,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                modifier = Modifier.padding(2.dp),
                text = "Episode Count:${anime.episode_count}",
                overflow = TextOverflow.Ellipsis,
                fontSize = 14.sp,
                color = Color.Black
            )
                Text(
                    modifier = Modifier.padding(2.dp),
                    text = "Start Date:${anime.start_date}",
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 14.sp,
                    color = Color.Blue
                )
                Text(
                    modifier = Modifier.padding(2.dp),
                    text = "End Date:${anime.end_date}",
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 14.sp,
                    color = Color.Red
                )
            Text(
                modifier = Modifier.padding(2.dp),
                text = "Trailer Link: \n ${anime.trailer_url}",
                overflow = TextOverflow.Ellipsis,
                fontSize = 14.sp,
                color = Color.Blue.copy(alpha = 0.6f),
            )
            Text(
                modifier = Modifier.padding(top = 8.dp),
                text = " Description: \n ${anime.description}",
                overflow = TextOverflow.Ellipsis,
                fontSize = 14.sp,

                color = Color.DarkGray
            )
        }

    }


}