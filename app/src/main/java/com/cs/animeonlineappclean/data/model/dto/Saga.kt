package com.cs.animeonlineappclean.data.model.dto

data class Saga(
    val descriptions: DescriptionsX,
    val episode_from: Int,
    val episode_to: Int,
    val episodes_count: Int,
    val titles: Titles
)