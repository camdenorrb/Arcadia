import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.3.40"
}

group = "me.camdenorrb"
version = "1.0.0"

repositories {
    jcenter()
    mavenCentral()
}

dependencies {

    implementation(kotlin("stdlib-jdk8"))
    implementation("net.dv8tion:JDA:3.8.3_463")

    testCompile("org.jetbrains.kotlin:kotlin-test-junit")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}