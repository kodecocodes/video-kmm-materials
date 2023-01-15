package com.kodeco.core

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun info(): String {
        return "Current device is ${platform.model} and language set is ${platform.language}"
    }
}