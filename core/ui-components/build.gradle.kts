plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id(Dependencies.Plugin.jacocoReport)
}

android {
    namespace = "br.com.newscurrent.ui_components"
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
            enableUnitTestCoverage = true
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

    testOptions.unitTests.isIncludeAndroidResources = true
    testOptions.unitTests.isReturnDefaultValues = true
}

dependencies {

    implementation(project(":core:testing"))
    implementation(project(":core:extensions"))

    implementation(Dependencies.Main.appcompat)
    implementation(Dependencies.Main.constraint_layout)

    //Unit Test
    testImplementation(Dependencies.Testing.robolectric)

    //Instrumental Test
    androidTestImplementation(Dependencies.Testing.assertK)
    androidTestImplementation(Dependencies.Testing.robolectric)
    androidTestImplementation(Dependencies.Testing.mockk)
    androidTestImplementation(Dependencies.Testing.AutomatedTest.ext_junit)
    androidTestImplementation(Dependencies.Testing.AutomatedTest.test_runner)
    androidTestImplementation(Dependencies.Testing.AutomatedTest.espresso_core)
}