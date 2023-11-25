package com.example.laborlab5

class SimpleCoffee : Coffee {
    override fun price(): Double {
        return 100.0
    }

    override fun description(): String {
        return "Простое кофе"
    }
}