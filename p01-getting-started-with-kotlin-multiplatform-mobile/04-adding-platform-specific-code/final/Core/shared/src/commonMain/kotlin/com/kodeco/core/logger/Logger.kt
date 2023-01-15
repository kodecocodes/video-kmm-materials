package com.kodeco.core.logger

internal expect class PlatformLogger() {

    fun debug(tag: String, message: String)

    fun warn(tag: String, message: String)

    fun error(tag: String, message: String)
}

public object Logger {

    private val logger = PlatformLogger()

    public fun d(tag: String, message: String) {
        logger.debug(tag, message)
    }

    public fun w(tag: String, message: String) {
        logger.warn(tag, message)
    }

    public fun e(tag: String, message: String) {
        logger.error(tag, message)
    }
}