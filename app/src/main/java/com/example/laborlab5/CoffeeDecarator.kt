package com.example.laborlab5

abstract class CoffeeDecorator(private val decoratedCoffee: Coffee) : Coffee {
    override fun price(): Double {
        return decoratedCoffee.price()
    }

    override fun description(): String {
        return decoratedCoffee.description()
    }
}

class MilkDecorator(decoratedCoffee: Coffee) : CoffeeDecorator(decoratedCoffee) {
    override fun price(): Double {
        // Добавляем стоимость молока к базовой стоимости
        return super.price() + 40.0
    }

    override fun description(): String {
        // Добавляем описание молока
        return super.description() + " с молоком"
    }
}

class SugarDecorator(decoratedCoffee: Coffee) : CoffeeDecorator(decoratedCoffee) {
    override fun price(): Double {
        // Добавляем стоимость сахара к базовой стоимости
        return super.price() + 50.0
    }

    override fun description(): String {
        // Добавляем описание сахара
        return super.description() + " с сахаром "
    }
}