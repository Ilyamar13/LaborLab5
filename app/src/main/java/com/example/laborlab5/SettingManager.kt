package com.example.laborlab5

class SettingsManager private constructor() {
    private var settings: Map<String, Any> = HashMap()

    companion object {
        private var instance: SettingsManager? = null

        fun getInstance(): SettingsManager {
            if (instance == null) {
                instance = SettingsManager()
            }
            return instance as SettingsManager
        }
    }

    fun getSetting(key: String): Any? {
        return settings[key]
    }

    fun setSetting(key: String, value: Any) {
        (settings as HashMap)[key] = value
    }
}

fun main() {
    val manager = SettingsManager.getInstance()

    manager.setSetting("theme", "dark")
    manager.setSetting("fontSize", 16)

    val theme = manager.getSetting("theme")
    val fontSize = manager.getSetting("fontSize")

    println("Тема: $theme, Размер шрифта: $fontSize")
}

