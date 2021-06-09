package uk.co.dtd.pokedex

// https://www.brightec.co.uk/blog/kotlin-multiplatform-androidios-testing

@Suppress("UnusedPrivateMember")
internal expect fun <T> runTest(block: suspend () -> T)