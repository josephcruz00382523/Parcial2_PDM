package com.pdmcourse2026.basictemplate.data.api.Repository

import com.pdmcourse2026.basictemplate.Model.Votos

interface VotingsRepository{

    suspend fun getVotos(): List<Votos>
    suspend fun addVotings(votings: Votos)
}