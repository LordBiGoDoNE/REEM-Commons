plugins {
    id("java-library")
    id("maven-publish")
}

group = "org.rvsoftworks"
version = "1.0-SNAPSHOT"
description = "Agent for REEM platform"

publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
            groupId = "org.rvsoftworks"
            artifactId = "REEM-Commons"
            version = "1.0.0"
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/LordBiGoDoNE/SEU_REPOSITORIO")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME_GITHUB")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN_GITHUB")
            }
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-annotations")
    implementation("jakarta.validation:jakarta.validation-api")
}