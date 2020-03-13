plugins {
    id("org.jetbrains.kotlin.js") version "1.3.70"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("is-sorted"))
    testImplementation(kotlin("test-js"))
}

kotlin {
    target {
        browser {
            testTask {
                useKarma {
                    useChrome()
                }
            }
        }
    }
}
