package com.example.laborlab5

class Subject {
    private val observers: MutableList<Observer> = ArrayList()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers(message: String) {
        for (observer in observers) {
            observer.update(message)
        }
    }
}

class ObserverA : Observer {
    override fun update(message: String) {
        println("ObserverA received update: $message")
    }
}

class ObserverB : Observer {
    override fun update(message: String) {
        println("ObserverB received update: $message")
    }
}