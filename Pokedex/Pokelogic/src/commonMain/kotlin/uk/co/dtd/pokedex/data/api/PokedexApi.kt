package uk.co.dtd.pokedex.data.api

import uk.co.dtd.pokedex.data.entities.PokedexDTO
import uk.co.dtd.pokedex.data.entities.PokemonDTO
import uk.co.dtd.pokedex.data.entities.PokemonDetailsDTO

interface PokedexApi {

    suspend fun getPokedex(): PokedexDTO
    suspend fun getPokemonDetails(pokemon: PokemonDTO): PokemonDetailsDTO
}