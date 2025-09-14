plugins {
    id("java-library")
    id("maven-publish")
}

group = "org.rvsoftworks"
version = "1.0.0"
description = "Commons for REEM platform"

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/LordBiGoDoNE/REEM-Commons")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])

            groupId = "org.rvsoftworks"
            artifactId = "reem.commons"
            version = project.version.toString()
        }
    }
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.15.2")
}