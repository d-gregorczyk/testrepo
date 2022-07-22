import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.6.21"
    application
}

group = "org.sdpi.test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    // https://mvnrepository.com/artifact/com.github.ajalt/clikt
    implementation(group = "com.github.ajalt", name = "clikt", version = "2.8.0")

    // https://mvnrepository.com/artifact/org.asciidoctor/asciidoctorj
    implementation("org.asciidoctor:asciidoctorj:2.5.4")
    implementation("org.asciidoctor:asciidoctorj-pdf:2.1.4")
    implementation("org.asciidoctor:asciidoctorj-diagram:2.2.3")
    implementation("org.asciidoctor:asciidoctorj-diagram-plantuml:1.2022.5")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.10")

    // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
    implementation("org.apache.logging.log4j:log4j-core:2.17.2")

    // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api-kotlin
    implementation("org.apache.logging.log4j:log4j-api-kotlin:1.0.0")



    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<JavaCompile>("compileJava") {
    options.compilerArgs = listOf("--add-opens", "java.base/sun.nio.ch=ALL-UNNAMED")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}