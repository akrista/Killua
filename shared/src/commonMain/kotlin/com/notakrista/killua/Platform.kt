package com.notakrista.killua

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform