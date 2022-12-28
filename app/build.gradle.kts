plugins {
    id(Dependencies.Plugin.android_application)
    id(Dependencies.Plugin.kotlin_android)
    id(Dependencies.Plugin.kotlin_kapt)
    id(Dependencies.Plugin.kotlin_parcelize)
    id(Dependencies.Plugin.jacocoReport)
}

val limits = extra["limits"] as MutableMap<String, Double>
limits["instruction"] = 0.0
limits["branch"] = 0.0
extra.set("limits", limits)

android {

    namespace = AppConfig.namespace
    compileSdk = AppConfig.compileSdkVersion

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdk = AppConfig.minSdkVersion
        targetSdk = AppConfig.targetSdkVersion
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.testInstrumentationRunner
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
}
dependencies {

    implementation(project(":core:network"))
    implementation(project(":core:testing"))
    implementation(project(":core:extensions"))
    implementation(project(":core:ui-components"))

    //Kotlin
    implementation(Dependencies.Kotlin.kotlin)
    implementation(Dependencies.Kotlin.kotlinLib)
    implementation(Dependencies.Kotlin.kotlinReflect)

    //Core and Material Design
    implementation(Dependencies.Main.core_ktx)
    implementation(Dependencies.Main.appcompat)
    implementation(Dependencies.Main.material)
    implementation(Dependencies.Main.constraint_layout)
    implementation(Dependencies.Main.swipe_refresh_layout)

    //Lifecycle
    implementation(Dependencies.Main.Lifecycle.lifecycle_livedata)
    implementation(Dependencies.Main.Lifecycle.lifecycle_viewmodel)
    implementation(Dependencies.Main.Lifecycle.lifecycle_runtime)

    //ThirdParty
    kapt(Dependencies.ThirdParty.glide_compiler)
    implementation(Dependencies.ThirdParty.glide)
    implementation(Dependencies.ThirdParty.koin)
    implementation(Dependencies.ThirdParty.facebook_shimmer)

    //Network
    implementation(Dependencies.Network.retrofit)
    implementation(Dependencies.Network.converter_gson)
    implementation(Dependencies.Network.okhttp3_logging_interceptor)

    //Tests
    testImplementation(Dependencies.Testing.assertK)
    testImplementation(Dependencies.Testing.robolectric)
    testImplementation(Dependencies.Testing.mockk)
    testImplementation(Dependencies.Testing.junit)
    testImplementation(Dependencies.Testing.koin_test)
    androidTestImplementation(Dependencies.Testing.mockk_android)
    androidTestImplementation(Dependencies.Testing.ext_junit)
    androidTestImplementation(Dependencies.Testing.espresso_core)
}
