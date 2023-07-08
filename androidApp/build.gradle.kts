plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.kmmnoteapp.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.kmmnoteapp.android"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.4"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.4.0")
    implementation("androidx.compose.ui:ui-tooling:1.4.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.4.0")
    implementation("androidx.compose.foundation:foundation:1.4.0")
    implementation("androidx.compose.material:material:1.4.0")
    implementation("androidx.activity:activity-compose:1.7.0")


    /***** KOIN *****/
    implementation("io.insert-koin:koin-android:3.2.0-beta-1")
    implementation("io.insert-koin:koin-androidx-navigation:3.2.0-beta-1")
    implementation("io.insert-koin:koin-androidx-compose:3.2.0-beta-1")

    /***** MATERIAL ICONS *****/
    implementation("androidx.compose.material:material-icons-extended:1.4.3")
    /***** NAVIGATION COMPONENT *****/
    implementation("androidx.navigation:navigation-compose:2.6.0-rc01")
    /***** MOSHI *****/
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    /***** COIL *****/
    implementation("io.coil-kt:coil-compose:2.2.2")
    /***** HTTP INTERCEPTOR *****/
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.1")
    /***** RETROFIT *****/
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

}