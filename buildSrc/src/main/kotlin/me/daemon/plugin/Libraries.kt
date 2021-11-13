package me.daemon.plugin

object Libraries {

    /**
     * versions
     */
    @Suppress("ClassName")
    private object v {
        const val kotlin = "1.5.21"

        const val annotation = "1.2.0"
        const val core = "1.6.0"
        const val appCompat = "1.3.1"
        const val fragment = "1.3.6"

        const val gradlePlugin = "7.0.2"
    }

    /**
     * Android libraries
     */
    object A {
        const val gradle = "com.android.tools.build:gradle:${v.gradlePlugin}"
    }

    /**
     * AndroidX libraries
     */
    object X {
        const val annotation = "androidx.annotation:annotation:${v.annotation}"
        const val core = "androidx.core:core:${v.core}"
        const val appCompat = "androidx.appcompat:appcompat:${v.appCompat}"
        const val fragmentKtx = "androidx.fragment:androidx.fragment:fragment-ktx:${v.fragment}"
    }

    /**
     * kotlin libraries
     */
    object K {
        const val bom = "org.jetbrains.kotlin:kotlin-bom"
        const val std = "org.jetbrains.kotlin:kotlin-stdlib:${v.kotlin}"
        const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${v.kotlin}"
    }

}