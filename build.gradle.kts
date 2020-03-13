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
}

kotlin.target.browser { }
