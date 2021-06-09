package uk.co.dtd.pokedex.android.presentation.pokedex

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.drawable.toBitmap
import androidx.palette.graphics.Palette
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimationSpec
import com.airbnb.lottie.compose.rememberLottieAnimationState
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.imageloading.ImageLoadState
import uk.co.dtd.pokedex.android.R
import uk.co.dtd.pokedex.data.entities.*
import uk.co.dtd.pokedex.domain.pokedex.PokedexState
import uk.co.dtd.pokedex.domain.pokedex.Pokemon
import uk.co.dtd.pokedex.presentation.PokedexViewModel
import java.util.*
import kotlin.collections.ArrayList

@Preview
@Composable
fun ComposablePreview() {
    val types = ArrayList<Type>()
    types.add(Type(0, Species("Electric", "")))
    types.add(Type(0, Species("Mouse", "")))

    val pokemon = ArrayList<Pokemon>()
    pokemon.add(
        Pokemon.Rich(
            PokemonDetailsDTO(
                emptyList(),
                Sprites("", ""), 0, 0, emptyList(),
                "Pikachu", 0, emptyList(),
                types, 0
            )
        )
    )
    pokemon.add(Pokemon.Plain(PokemonDTO("Pikachu", "")))

    Content(pokemons = pokemon) {}
}

@Composable
fun PokedexScreen(pokedexViewModel: PokedexViewModel = PokedexViewModel()) {

    var state by remember {
        mutableStateOf(pokedexViewModel.pokedexState.value)
    }

    when (val currentState = state) {
        is PokedexState.Loading -> {
            Loading()
        }
        is PokedexState.Content -> {
            Content(currentState.data, onBind = {
                when (it) {
                    is Pokemon.Plain -> pokedexViewModel.pokemonViewed(it.data)
                    else -> {
                    }
                }
            })
        }
        is PokedexState.Error -> {
            Error()
        }
    }

    pokedexViewModel.pokedexState.addObserver {
        state = it
    }
}

@Composable
private fun Loading() {
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val animationSpec = remember { LottieAnimationSpec.RawRes(R.raw.loading) }
        // You can control isPlaying/progress/repeat/etc. with this.
        val animationState = rememberLottieAnimationState(autoPlay = true, repeatCount = Integer.MAX_VALUE)

        LottieAnimation(
            animationSpec, modifier = Modifier.fillMaxWidth(0.5f),
            animationState,
        )
    }
}

@Composable
private fun Content(pokemons: List<Pokemon>, onBind: (Pokemon) -> Unit) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        items(pokemons) {
            onBind(it)
            PokedexEntry(pokemon = it)
        }
    }
}

@Composable
private fun PokedexEntry(pokemon: Pokemon) {
    val name: String
    var number: String? = null
    var imageUrl: String? = null
    var types: List<Type> = ArrayList()

    when (pokemon) {
        is Pokemon.Rich -> {
            name = pokemon.data.name
            number = "#${pokemon.data.id.toString().padStart(3, '0')}"
            imageUrl = pokemon.data.sprites.frontDefault
            types = pokemon.data.types
        }
        is Pokemon.Plain -> {
            name = pokemon.data.name
        }
        is Pokemon.Loading -> {
            name = pokemon.data.name
        }
        is Pokemon.Error -> {
            name = pokemon.data.name
        }
    }

    val gray = colorResource(id = R.color.gray)
    var backgroundColor by remember { mutableStateOf(gray) }

    Card(
        elevation = 4.dp,
        backgroundColor = backgroundColor
    ) {

        Row(
            Modifier
                .fillMaxSize()
                .padding(8.dp)
                .height(IntrinsicSize.Max)
        ) {

            Column(
                Modifier
                    .weight(1f, fill = true)
                    .fillMaxHeight(),
                Arrangement.SpaceBetween
            ) {
                Text(
                    text = number ?: "",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.white)
                )

                Text(
                    text = name.capitalize(Locale.getDefault()),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.white)
                )
                
                Spacer(modifier = Modifier.weight(1f))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.Bottom
                ) {

                    types = types.take(2)

                    val color = colorResource(id = R.color.mineShaft)
                    val adjustedColor = Color(color.red, color.green, color.blue, 0.5f)

                    for (type in types) {
                        Box(
                            Modifier
                                .height(24.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(adjustedColor)
                                .padding(start = 16.dp, end = 16.dp), Alignment.Center
                        ) {

                            Text(
                                text = type.type.name.capitalize(Locale.getDefault()),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = colorResource(id = R.color.white)
                            )
                        }
                    }
                }
            }

            val painter = rememberCoilPainter(
                request = imageUrl,
                fadeIn = true,
                previewPlaceholder = R.drawable.pokemon
            )

            Image(
                painter = painter,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(80.dp)
            )

            when (val state = painter.loadState) {
                is ImageLoadState.Success -> {
                    val bitmap = state.result.toBitmap().copy(Bitmap.Config.ARGB_8888, true)
                    val palette = Palette.from(bitmap).generate()
                    val color = palette.getMutedColor(colorResource(id = R.color.gray).toArgb())
                    backgroundColor = Color(color)
                }
            }
        }
    }
}

@Composable
private fun Error() {
    Text(text = "Error")
}