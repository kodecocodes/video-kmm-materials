package com.kodeco.core

import java.util.Locale

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
    override val model: String = android.os.Build.MODEL
    override val language: String = Locale.getDefault().language
}

actual fun getPlatform(): Platform = AndroidPlatform()