package uk.co.dtd.pokedex.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import uk.co.dtd.pokedex.android.presentation.pokedex.PokedexScreen
import uk.co.dtd.pokedex.data.api.PokeApi
import uk.co.dtd.pokedex.presentation.PokedexViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val pokedexViewModel = PokedexViewModel()
            PokedexScreen(pokedexViewModel = pokedexViewModel)
            pokedexViewModel.viewDidLoad()
        }
    }
}
