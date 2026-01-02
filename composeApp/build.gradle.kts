import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidKmpLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
}

kotlin {
    val isAndroidOnly = project.findProperty("kmp.android.only")?.toString()?.toBoolean() ?: false

    androidLibrary {
        namespace = "com.notakrista.killua.compose"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        compilerOptions { jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21) }
    }

    if (!isAndroidOnly) {
        listOf(iosArm64(), iosSimulatorArm64()).forEach { iosTarget ->
            iosTarget.binaries.framework {
                baseName = "ComposeApp"
                isStatic = true
            }
        }

        jvm()

        js {
            browser()
            binaries.executable()
        }

        @OptIn(ExperimentalWasmDsl::class)
        wasmJs {
            browser()
            binaries.executable()
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)
        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
            implementation(projects.shared)
        }
        commonTest.dependencies { implementation(libs.kotlin.test) }
        androidUnitTest { dependencies { implementation(libs.kotlin.test) } }
        if (!isAndroidOnly) {
            jvmMain.dependencies {
                implementation(compose.desktop.currentOs)
                implementation(libs.kotlinx.coroutinesSwing)
            }
            jvmTest { dependencies { implementation(libs.kotlin.test) } }
            jsTest { dependencies { implementation(libs.kotlin.test) } }
            wasmJsTest { dependencies { implementation(libs.kotlin.test) } }
            iosX64Test { dependencies { implementation(libs.kotlin.test) } }
            iosArm64Test { dependencies { implementation(libs.kotlin.test) } }
            iosSimulatorArm64Test { dependencies { implementation(libs.kotlin.test) } }
        }
    }
}

// dependencies block removed for composeApp as library or moved to sourceSets

compose.desktop {
    application {
        mainClass = "com.notakrista.killua.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.notakrista.killua"
            packageVersion = "1.0.0"
        }
    }
}
