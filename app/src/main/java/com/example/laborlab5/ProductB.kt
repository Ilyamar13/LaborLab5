package com.example.laborlab5

class ProductB : Product {
    override fun getDescription(): String {
        return "ConcreteProductB"
    }
}

class CreatorB : Creator {
    override fun createProduct(): Product {
        return ProductB()
    }
}