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
    implementation(libs.daemon.annotation)
    implementation(libs.daemon.infrastructure.application)
}

apply(from = "$rootDir/gradle/maven-publish.gradle")
