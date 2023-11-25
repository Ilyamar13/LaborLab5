package com.example.laborlab5

import android.hardware.lights.Light

class LightOnCommand(private val light: light1) : Command {
    override fun execute() {
        light.turnOn()
    }
}

private fun Light.turnOn() {
    TODO("Not yet implemented")
}

class LightOffCommand(private val light: light1) : Command {
    override fun execute() {
        light.turnOff()
    }
}

private fun Light.turnOff() {
    TODO("Not yet implemented")
}

