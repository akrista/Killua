import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidKmpLibrary)
}

kotlin {
    val isAndroidOnly = project.findProperty("kmp.android.only")?.toString()?.toBoolean() ?: false

    androidLibrary {
        namespace = "com.notakrista.killua.shared"
        compileSdk = libs.versions.android.compileSdk.get().toInt()
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
        }
    }
    
    if (!isAndroidOnly) {
        iosArm64()
        iosSimulatorArm64()

        jvm()

        js {
            browser()
        }

        @OptIn(ExperimentalWasmDsl::class)
        wasmJs {
            browser()
        }
    }
    
    sourceSets {
        commonMain.dependencies {
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        androidUnitTest {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
        if (!isAndroidOnly) {
            jvmTest {
                dependencies {
                    implementation(libs.kotlin.test)
                }
            }
            jsTest {
                dependencies {
                    implementation(libs.kotlin.test)
                }
            }
            wasmJsTest {
                dependencies {
                    implementation(libs.kotlin.test)
                }
            }
            iosX64Test {
                dependencies {
                    implementation(libs.kotlin.test)
                }
            }
            iosArm64Test {
                dependencies {
                    implementation(libs.kotlin.test)
                }
            }
            iosSimulatorArm64Test {
                dependencies {
                    implementation(libs.kotlin.test)
                }
            }
        }
    }
}

