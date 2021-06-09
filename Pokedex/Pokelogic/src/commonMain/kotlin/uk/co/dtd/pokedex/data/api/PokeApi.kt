package uk.co.dtd.pokedex.data.api

import io.ktor.client.*
import io.ktor.client.engine.*
import io.ktor.client.request.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import uk.co.dtd.pokedex.data.entities.PokedexDTO
import uk.co.dtd.pokedex.data.entities.PokemonDTO
import uk.co.dtd.pokedex.data.entities.PokemonDetailsDTO

class PokeApi(engine: HttpClientEngine = HttpClient().engine): PokedexApi {

    private val client = HttpClient(engine)
    private val format = Json { ignoreUnknownKeys = true }

    override suspend fun getPokedex(): PokedexDTO {
        val url = "https://pokeapi.co/api/v2/pokemon?limit=151&offset=0"
        val json = client.get<String>(url)
        return format.decodeFromString(json)
    }

    override suspend fun getPokemonDetails(pokemon: PokemonDTO): PokemonDetailsDTO {
        val json = client.get<String>(pokemon.url)
        return format.decodeFromString(json)
    }
}