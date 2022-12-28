plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "br.com.newscurrent.testing"
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
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")

    //Tests
    implementation(Dependencies.Testing.mockk)
    implementation(Dependencies.Testing.objenesis)

    testImplementation(Dependencies.Testing.assertK)
    testImplementation(Dependencies.Testing.robolectric)
    testImplementation(Dependencies.Testing.mockk)
    testImplementation(Dependencies.Testing.junit)
    testImplementation(Dependencies.Testing.koin_test)
    androidTestImplementation(Dependencies.Testing.mockk_android)
    androidTestImplementation(Dependencies.Testing.ext_junit)
    androidTestImplementation(Dependencies.Testing.espresso_core)
}