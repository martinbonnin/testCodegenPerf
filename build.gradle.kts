plugins {
    id("com.apollographql.apollo").version("2.0.3")
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