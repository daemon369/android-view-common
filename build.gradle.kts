//import me.daemon.plugin.Libraries

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
//        classpath (libs.gradle)
//        classpath (libs.kotlin.plugin)
//        classpath(Libraries.A.gradle)
//        classpath(Libraries.K.plugin)
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.create<Delete>("clean") {
    delete(rootProject.buildDir)
}

apply(from = "$rootDir/gradle/publish-root.gradle")