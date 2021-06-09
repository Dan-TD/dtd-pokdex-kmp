plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    val compose_version = "1.0.0-beta05"

    implementation(project(":Pokelogic"))
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.3")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")

    implementation("androidx.compose.ui:ui:$compose_version")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:$compose_version")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:$compose_version")
    // Material Design
    implementation("androidx.compose.material:material:$compose_version")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:$compose_version")
    implementation("androidx.compose.material:material-icons-extended:$compose_version")
    // Integration with activities
    implementation("androidx.activity:activity-compose:1.3.0-alpha07")
    // Integration with ViewModels
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha04")
    // Integration with observables
    implementation("androidx.compose.runtime:runtime-livedata:$compose_version")
    implementation("androidx.compose.runtime:runtime-rxjava2:$compose_version")

    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable-jvm:0.3.4")

    implementation("androidx.appcompat:appcompat:1.3.0-rc01")

    implementation("io.coil-kt:coil:1.2.0")
    implementation("com.google.accompanist:accompanist-coil:0.8.1")
    implementation("androidx.palette:palette:1.0.0")

    implementation( "com.airbnb.android:lottie-compose:1.0.0-beta03-1")

    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$compose_version")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "uk.co.dtd.pokedex.android"
        minSdkVersion(22)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        // Enables Jetpack Compose for this module
        compose = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta01"
    }
}