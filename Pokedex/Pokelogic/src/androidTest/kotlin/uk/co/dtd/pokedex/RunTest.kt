package uk.co.dtd.pokedex

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking

@OptIn(ExperimentalCoroutinesApi::class)
internal actual fun <T> runTest(block: suspend () -> T) {
    runBlocking { block() }
}