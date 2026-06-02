package com.pdmcourse2026.basictemplate.data.api.Repository

import com.pdmcourse2026.basictemplate.Model.Votos
import com.pdmcourse2026.basictemplate.data.api.KtorClient
import com.pdmcourse2026.basictemplate.data.api.VotosDto
import com.pdmcourse2026.basictemplate.data.api.toModel
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.contentType

class VotosRepositoryImpl : VotingsRepository {

    override suspend fun getVotos(): List<Votos> {
        val response: List<VotosDto> = KtorClient.client.get("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/options").body()
        return response.map { it.toModel() }
    }

    override suspend fun addVotings(votings: Votos) {
        KtorClient.client.post("https://qjcxdvfzyseuvezacxsd.supabase.co/functions/v1/rankeuca/vote") {
            contentType(ContentType.Application.Json)
            setBody(votings)
        }
    }
}
