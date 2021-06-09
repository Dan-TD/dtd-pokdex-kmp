package uk.co.dtd.pokedex.domain.pokedex

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import uk.co.dtd.pokedex.data.api.PokedexApi
import uk.co.dtd.pokedex.data.entities.PokemonDTO
import uk.co.dtd.pokedex.data.entities.PokemonDetailsDTO

class PokedexUseCase(private val pokedexApi: PokedexApi) {

    private val _pokedexState: MutableStateFlow<PokedexState> = MutableStateFlow(PokedexState.Loading)
    val pokedexState: StateFlow<PokedexState> = _pokedexState

    fun getPokemon() {
        GlobalScope.launch {
            _pokedexState.emit(PokedexState.Loading)

            val pokemon = pokedexApi.getPokedex().results.map {
                Pokemon.Plain(it)
            }

            _pokedexState.emit(PokedexState.Content(pokemon))
        }
    }

    fun getPokemonDetails(pokemon: PokemonDTO) {
        GlobalScope.launch {
            var pokedexData: List<Pokemon> = when (val currentState = pokedexState.value) {
                is PokedexState.Content -> {
                    currentState.data
                }
                else -> { return@launch }
            }

            var updatedPokedexData: List<Pokemon> = pokedexData.map {
                when (it) {
                    is Pokemon.Plain -> {
                        if (it.data.name == pokemon.name) {
                            Pokemon.Loading(it.data)
                        } else {
                            it
                        }
                    }
                    else -> {
                        it
                    }
                }
            }

            _pokedexState.emit(PokedexState.Content(updatedPokedexData))

            val pokemonDetails = pokedexApi.getPokemonDetails(pokemon)

            pokedexData = when (val currentState = pokedexState.value) { // ensure we're not setting stale data
                is PokedexState.Content -> {
                    currentState.data
                }
                else -> { return@launch }
            }

            updatedPokedexData = pokedexData.map {
                when (it) {
                    is Pokemon.Loading -> {
                        if (it.data.name == pokemon.name) {
                            Pokemon.Rich(pokemonDetails)
                        } else {
                            it
                        }
                    }
                    else -> {
                        it
                    }
                }
            }

            _pokedexState.emit(PokedexState.Content(updatedPokedexData))
        }
    }
}