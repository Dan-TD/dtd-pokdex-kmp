package uk.co.dtd.pokedex

import dev.icerock.moko.mvvm.livedata.asFlow
import dev.icerock.moko.mvvm.test.TestViewModelScope
import dev.icerock.moko.test.AndroidArchitectureInstantTaskExecutorRule
import dev.icerock.moko.test.TestRule
import dev.icerock.moko.test.runBlocking
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import uk.co.dtd.pokedex.data.api.PokeApi
import uk.co.dtd.pokedex.data.entities.PokemonDTO
import uk.co.dtd.pokedex.domain.pokedex.PokedexState
import uk.co.dtd.pokedex.domain.pokedex.PokedexUseCase
import uk.co.dtd.pokedex.domain.pokedex.Pokemon
import uk.co.dtd.pokedex.presentation.PokedexViewModel
import kotlin.test.*

class PokedexViewModelTests {

    @get:TestRule
    val instantTaskExecutorRule = AndroidArchitectureInstantTaskExecutorRule()

    @BeforeTest
    fun setup() {
        TestViewModelScope.setupViewModelScope(CoroutineScope(Dispatchers.Unconfined))
    }

    @AfterTest
    fun reset() {
        TestViewModelScope.resetViewModelScope()
    }

    @Test
    fun testPokedexLoading() = runBlocking {
        val sut = PokedexViewModel(PokedexUseCase(PokeApi(PokedexApiMockEngine().get())))

        val states = ArrayList<PokedexState>()

        sut.pokedexState.addObserver {
            states.add(it)

            if (states.size >= 1) {
                assertEquals(states.first(), PokedexState.Loading)
            }
        }

        sut.viewDidLoad()
    }

    @Test
    fun testPokedexContent() = runBlocking {
        val sut = PokedexViewModel(PokedexUseCase(PokeApi(PokedexApiMockEngine().get())))

        val states = ArrayList<PokedexState>()

        sut.pokedexState.addObserver {
            states.add(it)

            if (states.size >= 2) {
                assertEquals(states.first(), PokedexState.Loading)

                val pokedexData = when(val state = states.last()) {
                    is PokedexState.Content -> {
                        state.data
                    }
                    else -> {
                        fail()
                    }
                }

                when(val firstPokemon = pokedexData.first()) {
                    is Pokemon.Plain -> {
                        assertEquals(firstPokemon.data.name, "bulbasaur")
                    }
                    else -> {
                        fail()
                    }
                }
            }
        }

        sut.viewDidLoad()
    }

    @Test
    fun testPokemonLoading() = runBlocking {
        val sut = PokedexViewModel(PokedexUseCase(PokeApi(PokedexApiMockEngine().get())))

        val states = ArrayList<PokedexState>()

        sut.pokedexState.addObserver {
            states.add(it)

            if (states.size >= 3) {
                val pokedexData = when(val state = states.last()) {
                    is PokedexState.Content -> {
                        state.data
                    }
                    else -> {
                        fail()
                    }
                }

                when(val firstPokemon = pokedexData.first()) {
                    is Pokemon.Loading -> {
                        assertEquals(firstPokemon.data.name, "bulbasaur")
                    }
                    else -> {
                        fail()
                    }
                }
            }
        }

        sut.viewDidLoad()
        sut.pokemonViewed(PokemonDTO("bulbasaur",
            "https://pokeapi.co/api/v2/pokemon/1/"))
    }

    @Test
    fun testPokemonRichContent() = runBlocking {
        val sut = PokedexViewModel(PokedexUseCase(PokeApi(PokedexApiMockEngine().get())))

        val states = ArrayList<PokedexState>()

        sut.pokedexState.addObserver {
            states.add(it)

            if (states.size >= 4) {
                val pokedexData = when(val state = states.last()) {
                    is PokedexState.Content -> {
                        state.data
                    }
                    else -> {
                        fail()
                    }
                }

                when(val firstPokemon = pokedexData.first()) {
                    is Pokemon.Loading -> {
                        assertEquals(firstPokemon.data.name, "bulbasaur")
                    }
                    else -> {
                        fail()
                    }
                }
            }
        }

        sut.viewDidLoad()
        sut.pokemonViewed(PokemonDTO("bulbasaur",
            "https://pokeapi.co/api/v2/pokemon/1/"))
    }
}