package uk.co.dtd.pokedex.domain.pokedex

sealed class PokedexState {
    object Loading: PokedexState()
    object Error: PokedexState()
    data class Content(val data: List<Pokemon>): PokedexState()
}