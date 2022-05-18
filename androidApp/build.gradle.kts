import Versions.activityCompose
import Versions.appcompat
import Versions.compose
import Versions.navigation

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 32
    defaultConfig {
        applicationId = "com.softlex.medicaljournal.android"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = compose
    }
}

dependencies {
    implementation(project(":shared"))

    implementation("androidx.compose.foundation:foundation:$compose")
    implementation("androidx.compose.runtime:runtime:$compose")
    // UI
    implementation("androidx.compose.ui:ui:$compose")
    implementation("androidx.compose.ui:ui-tooling:$compose")
    // Material Design
    implementation("androidx.compose.material:material:$compose")
    implementation("androidx.compose.material:material-icons-core:$compose")
    // Activity
    implementation("androidx.activity:activity-compose:$activityCompose")
    implementation("androidx.appcompat:appcompat:$appcompat")
    // Navigation
    implementation("androidx.navigation:navigation-compose:$navigation")
}