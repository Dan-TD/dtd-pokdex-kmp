package uk.co.dtd.pokedex.domain.pokedex

import uk.co.dtd.pokedex.data.entities.PokemonDTO
import uk.co.dtd.pokedex.data.entities.PokemonDetailsDTO

sealed class Pokemon {
    data class Plain(val data: PokemonDTO): Pokemon()
    data class Loading(val data: PokemonDTO): Pokemon()
    data class Rich(val data: PokemonDetailsDTO): Pokemon()
    data class Error(val data: PokemonDTO): Pokemon()
}