import me.daemon.plugin.Libraries

plugins {
    id("com.android.library")
}

apply(from = "$rootDir/gradle/library_base.gradle")

android {
    sourceSets.getByName("main") {
        java.srcDirs("src/main/java", "src/main/kotlin")
    }

    buildFeatures {
        buildConfig = false
    }
}

dependencies {
    compileOnly(Libraries.X.fragment)
    implementation("io.github.daemon369:annotation:0.1.0")
    implementation("io.github.daemon369:android-infrastructure-application:0.1.1")
}

apply(from = "$rootDir/gradle/maven-publish.gradle")
