package com.kodeco.core

interface Platform {
    val name: String
    val model: String
    val language: String
}

expect fun getPlatform(): Platform