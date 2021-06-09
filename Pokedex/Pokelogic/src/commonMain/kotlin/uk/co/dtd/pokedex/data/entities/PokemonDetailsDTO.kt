package uk.co.dtd.pokedex.data.entities

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class PokemonDetailsDTO (
    val abilities: List<Ability>,
    val sprites: Sprites,
    val height: Long,
    val id: Long,
    val moves: List<Move>,
    val name: String,
    val order: Long,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Long
)

@Serializable
data class Ability (
    val ability: Species,

    @SerialName("is_hidden")
    val isHidden: Boolean,

    val slot: Long
)

@Serializable
data class Species (
    val name: String,
    val url: String
)

@Serializable
data class Move (
    val move: Species,

    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)

@Serializable
data class VersionGroupDetail (
    @SerialName("level_learned_at")
    val levelLearnedAt: Long,

    @SerialName("move_learn_method")
    val moveLearnMethod: Species,

    @SerialName("version_group")
    val versionGroup: Species
)

@Serializable
data class Sprites (
    @SerialName("back_default")
    val backDefault: String,

    @SerialName("front_default")
    val frontDefault: String
)

@Serializable
data class Stat (
    @SerialName("base_stat")
    val baseStat: Long,

    val effort: Long,
    val stat: Species
)

@Serializable
data class Type (
    val slot: Long,
    val type: Species
)
