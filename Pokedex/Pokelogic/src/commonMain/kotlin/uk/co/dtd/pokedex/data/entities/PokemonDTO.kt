package uk.co.dtd.pokedex.data.entities

import kotlinx.serialization.*

@Serializable
data class PokemonDTO (
    val name: String,
    val url: String
)
