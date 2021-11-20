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
        const val junit = "4.13.2"
        const val xJunit = "1.1.2"
        const val espresso = "3.3.0"
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
    }

    /**
     * test libraries
     */
    object T {
        const val junit = "junit:junit:${v.junit}"
        const val xJunit = "androidx.test.ext:junit:${v.xJunit}"
        const val espresso = "androidx.test.espresso:espresso-core:${v.espresso}"
    }

}