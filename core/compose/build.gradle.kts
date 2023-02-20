import org.jetbrains.kotlin.config.JvmAnalysisFlags.useIR

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "br.com.newscurrent.compose"
    compileSdk = 33

    defaultConfig {
        applicationId = "br.com.newscurrent.compose"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.2"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.Main.core_ktx)
    implementation(Dependencies.Main.Lifecycle.lifecycle_runtime)
    implementation(Dependencies.Compose.activity_compose)
    implementation(Dependencies.Compose.compose_ui)
    implementation(Dependencies.Compose.compose_ui_tooling_preview)
    implementation(Dependencies.Compose.compose_material)

    testImplementation(Dependencies.Testing.junit)

    androidTestImplementation(Dependencies.Testing.AutomatedTest.ext_junit)
    androidTestImplementation(Dependencies.Testing.AutomatedTest.espresso_core)
    androidTestImplementation(Dependencies.Testing.Compose.compose_ui_test_junit4)

    debugImplementation(Dependencies.Compose.compose_ui_tooling)
    debugImplementation(Dependencies.Compose.compose_ui_test_manifest)
}