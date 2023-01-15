package com.kodeco.core

import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.languageCode
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
    override val model: String = UIDevice.currentDevice.model
    override val language: String = NSLocale.currentLocale.languageCode
}

actual fun getPlatform(): Platform = IOSPlatform()