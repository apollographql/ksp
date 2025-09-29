rootProject.name = "ksp"

pluginManagement {
    val buildKotlinVersion: String by settings
    val buildKspVersion: String by settings

    plugins {
        kotlin("jvm") version buildKotlinVersion apply false
        id("com.google.devtools.ksp") version buildKspVersion apply false
    }

    repositories {
        gradlePluginPortal()
        maven("https://redirector.kotlinlang.org/maven/bootstrap/")
        maven("https://www.jetbrains.com/intellij-repository/snapshots")
        google()
        maven("https://storage.googleapis.com/gradleup/m2")
    }
}

plugins {
    id("com.gradleup.nmcp.settings") version "1.2.1-SNAPSHOT-7edc98cb4a9349ed31f7138dd45d0dfbf7625f79"
}

include("api")
include("gradle-plugin")
include("common-deps")
include("common-util")
include("test-utils")
include("compiler-plugin")
include("symbol-processing")
include("symbol-processing-cmdline")
include("integration-tests")
include("kotlin-analysis-api")
include("symbol-processing-aa-embeddable")
include("cmdline-parser-gen")
