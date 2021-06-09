package uk.co.dtd.pokedex

import kotlinx.coroutines.runBlocking

internal actual fun <T> runTest(block: suspend () -> T) {
    runBlocking { block() }
}