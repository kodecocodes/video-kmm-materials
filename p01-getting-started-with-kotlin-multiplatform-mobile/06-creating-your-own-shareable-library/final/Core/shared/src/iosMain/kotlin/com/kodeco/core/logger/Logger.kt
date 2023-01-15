package com.kodeco.core.logger

import platform.Foundation.NSLog

internal actual class PlatformLogger {

    actual fun debug(tag: String, message: String) {
        NSLog("$tag | $message")
    }

    actual fun warn(tag: String, message: String) {
        NSLog("$tag | $message")
    }

    actual fun error(tag: String, message: String) {
        NSLog("$tag | $message")
    }
}