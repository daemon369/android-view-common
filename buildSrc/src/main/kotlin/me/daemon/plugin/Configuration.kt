package me.daemon.plugin

object Configuration {
    const val minSdkVersion = 19
    const val compileSdkVersion = 30
    const val targetSdkVersion = 23
    const val buildToolsVersion = "30.0.3"
    const val groupId = "io.github.daemon369"
    const val artifactId = "android-view-common"
    const val version = "0.1.0"

    @Suppress("ClassName")
    object pom {
        const val name = artifactId
        const val description = "Common view tools for Android"
        const val url = "https://github.com/daemon369/AndroidViewCommon"

        @Suppress("ClassName")
        object scm {
            const val connection = "scm:git:github.com/daemon369/AndroidViewCommon.git"
            const val developerConnection =
                "scm:git:ssh://github.com/daemon369/AndroidViewCommon.git"
            const val url = "https://github.com/daemon369/AndroidViewCommon/tree/main"
        }
    }
}