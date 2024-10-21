package com.app.kmpmeditation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform