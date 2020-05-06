plugins {
    id("com.apollographql.apollo").version("1.4.5")
    kotlin("jvm").version("1.3.72")
}

buildscript {
    repositories {
        jcenter()
    }
}

apollo {
    generateKotlinModels.set(true)
}

dependencies {
    implementation("com.apollographql.apollo:apollo-runtime:2.0.1")
}