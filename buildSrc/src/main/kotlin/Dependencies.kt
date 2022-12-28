object Dependencies {
    object Plugin{
        const val android_application = "com.android.application"
        const val kotlin_android = "kotlin-android"
        const val kotlin_kapt = "kotlin-kapt"
        const val kotlin_parcelize = "kotlin-parcelize"
        const val detekt = "io.gitlab.arturbosch.detekt:${Version.detekt_version}"
        const val jacocoReport = "jacoco-reports"
        const val jacoco = "org.jacoco:org.jacoco.core:${Version.jacoco_version}"
    }
    object Gradle {
        const val gradle = "com.android.tools.build:gradle:${Version.gradle_version}"
        const val gradle_plugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.gradle_plugin_version}"
        const val gradle_plugin_tools =
            "com.android.tools.build:gradle:${Version.gradle_plugin_tools_version}"
    }

    object Kotlin {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin_version}"
        const val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin_version}"
        const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin_version}"
    }

    object Main {
        const val core_ktx = "androidx.core:core-ktx:${Version.core_ktx_version}"
        const val appcompat = "androidx.appcompat:appcompat:${Version.appcompat_version}"
        const val material = "com.google.android.material:material:${Version.material_version}"
        const val constraint_layout =
            "androidx.constraintlayout:constraintlayout:${Version.constraint_layout_version}"
        const val swipe_refresh_layout =
            "androidx.swiperefreshlayout:swiperefreshlayout:${Version.swipe_refresh_layout_version}"

        object Lifecycle {
            const val lifecycle_livedata =
                "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle_version}"
            const val lifecycle_viewmodel =
                "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle_version}"
            const val lifecycle_runtime =
                "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle_version}"
        }
    }

    object ThirdParty {
        const val facebook_shimmer="com.facebook.shimmer:shimmer:${Version.facebook_shimmer_version}"
        const val glide_compiler="com.github.bumptech.glide:compiler:${Version.glide_version}"
        const val glide="com.github.bumptech.glide:glide:${Version.glide_version}"
        const val koin= "io.insert-koin:koin-android:${Version.koin_version}"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit_version}"
        const val converter_gson =
            "com.squareup.retrofit2:converter-gson:${Version.retrofit_version}"
        const val okhttp3_logging_interceptor =
            "com.squareup.okhttp3:logging-interceptor:${Version.okhttp3_logging_interceptor_version}"
    }

    object Testing {
        const val assertK = "com.willowtreeapps.assertk:assertk-jvm:${Version.assertK_version}"
        const val mockk = "io.mockk:mockk:${Version.mockk_version}"
        const val mockk_android = "io.mockk:mockk-android:${Version.mockk_version}"
        const val objenesis="org.objenesis:objenesis:${Version.objenesis_version}"
        const val robolectric = "org.robolectric:robolectric:${Version.robolectric_version}"
        const val koin_test = "io.insert-koin:koin-test:${Version.koin_version}"
        const val junit = "junit:junit:${Version.junit_version}"
        const val ext_junit = "androidx.test.ext:junit:${Version.ext_junit_version}"
        const val espresso_core =
            "androidx.test.espresso:espresso-core:${Version.espresso_core_version}"
    }
}