plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "br.com.newscurrent.extensions"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        viewBinding = true
    }
}

dependencies {

    implementation(project(":core:network"))
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")

    //Lifecycle
    implementation(Dependencies.Main.Lifecycle.lifecycle_livedata)
    implementation(Dependencies.Main.Lifecycle.lifecycle_viewmodel)
    implementation(Dependencies.Main.Lifecycle.lifecycle_runtime)

    //Network
    implementation(Dependencies.Network.retrofit)
    implementation(Dependencies.Network.converter_gson)
    implementation(Dependencies.Network.okhttp3_logging_interceptor)

    //ThirdParty
    implementation(Dependencies.ThirdParty.glide)
    implementation(Dependencies.ThirdParty.facebook_shimmer)
}