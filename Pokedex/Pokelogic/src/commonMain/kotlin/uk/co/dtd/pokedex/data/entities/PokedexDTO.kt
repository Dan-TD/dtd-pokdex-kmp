package uk.co.dtd.pokedex.data.entities

import kotlinx.serialization.*

@Serializable
data class PokedexDTO (
    val count: Long,
    val next: String,
    val previous: String?,
    val results: List<PokemonDTO>
)