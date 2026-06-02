package com.pdmcourse2026.basictemplate.data.api

import com.pdmcourse2026.basictemplate.Model.Votos
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VotosDto(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val votes: Int
)

fun VotosDto.toModel() : Votos{
    return Votos(
        id = id,
        name = name,
        imageUrl = imageUrl,
        votes = votes
    )
}
