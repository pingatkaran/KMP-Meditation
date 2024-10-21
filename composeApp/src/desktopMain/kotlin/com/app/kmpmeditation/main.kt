package com.app.kmpmeditation

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-Meditation-App",
    ) {
        App()
    }
}