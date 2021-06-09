package uk.co.dtd.pokedex

import io.ktor.client.*
import io.ktor.client.engine.mock.*
import io.ktor.http.*

class PokedexApiMockEngine {
    fun get() = client.engine

    private val responseHeaders = headersOf("Content-Type" to listOf(ContentType.Application.Json.toString()))
    private val client = HttpClient(MockEngine) {
        engine {
            addHandler { request ->
                when {
                    request.url.encodedPath == "/api/v2/pokemon" -> {
                        respond(PokedexMockResponse(), HttpStatusCode.OK, responseHeaders)
                    }
                    request.url.encodedPath.contains("/api/v2/pokemon/*/".toRegex()) -> {
                        respond(PokemonDetailsMockResponse(), HttpStatusCode.OK, responseHeaders)
                    }
                    else -> {
                        error("Unhandled ${request.url.encodedPath}")
                    }
                }
            }
        }
    }
}