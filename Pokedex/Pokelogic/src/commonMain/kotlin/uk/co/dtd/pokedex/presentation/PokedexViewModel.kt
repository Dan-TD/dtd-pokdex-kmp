package uk.co.dtd.pokedex.presentation

import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.livedata.asLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import uk.co.dtd.pokedex.data.api.PokeApi
import uk.co.dtd.pokedex.data.entities.PokemonDTO
import uk.co.dtd.pokedex.domain.pokedex.PokedexState
import uk.co.dtd.pokedex.domain.pokedex.PokedexUseCase


class PokedexViewModel(private val pokedexUseCase: PokedexUseCase = PokedexUseCase((PokeApi()))): ViewModel() {

    val pokedexState: LiveData<PokedexState> = pokedexUseCase.pokedexState.asLiveData(viewModelScope)

    fun viewDidLoad() {
        pokedexUseCase.getPokemon()
    }

    fun pokemonViewed(pokemon: PokemonDTO) {
        pokedexUseCase.getPokemonDetails(pokemon)
    }
}