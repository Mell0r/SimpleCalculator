import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm") version "1.5.10"
    antlr
}

group = "me.jazzm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    antlr("org.antlr:antlr4:4.11.1")
    implementation("com.michael-bull.kotlin-result:kotlin-result:1.1.16")
}

tasks.named<AntlrTask>("generateGrammarSource").configure {
    arguments.addAll(listOf("-package", "antlrGeneratedSource", "-visitor", "-no-listener"))
    outputDirectory = File("src/main/java/antlrGeneratedSource")
}

tasks.named("compileKotlin").configure {
    dependsOn("generateGrammarSource")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}