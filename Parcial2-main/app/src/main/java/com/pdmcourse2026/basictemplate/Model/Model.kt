package com.pdmcourse2026.basictemplate.Model

import kotlinx.serialization.Serializable

@Serializable
data class Votos(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val votes: Int
)

