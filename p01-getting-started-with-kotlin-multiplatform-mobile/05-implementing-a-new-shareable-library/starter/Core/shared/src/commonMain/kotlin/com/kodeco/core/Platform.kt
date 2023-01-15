package com.kodeco.core

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform