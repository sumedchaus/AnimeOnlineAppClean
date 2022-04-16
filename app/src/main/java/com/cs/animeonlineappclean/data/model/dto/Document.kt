package com.cs.animeonlineappclean.data.model.dto

import com.cs.animeonlineappclean.domain.model.AnimeData

data class Document(
    val anilist_id: Int,
    val banner_image: String,
    val cover_color: String,
    val cover_image: String,
    val descriptions: Descriptions,
    val end_date: String,
    val episode_duration: Int,
    val episodes_count: Int,
    val format: Int,
    val genres: List<String>,
    val has_cover_image: Boolean,
    val id: Int,
    val mal_id: Int,
    val nsfw: Boolean,
    val prequel: Int,
    val recommendations: List<Int>,
    val sagas: List<Saga>,
    val score: Int,
    val season_period: Int,
    val season_year: Int,
    val sequel: Int,
    val start_date: String,
    val status: Int,
    val titles: TitlesX,
    val tmdb_id: Int,
    val trailer_url: String,
    val weekly_airing_day: Int
)


fun Document.toAnimeData() : AnimeData{
    return AnimeData(
        title = titles.en,
        description = descriptions.en,
        start_date = start_date,
        end_date = end_date,
        trailer_url = trailer_url,
        episode_count = episodes_count


    )
}