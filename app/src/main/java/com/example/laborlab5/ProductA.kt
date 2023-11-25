package com.example.laborlab5

class ProductA : Product {
    override fun getDescription(): String {
        return "ConcreteProductA"
    }
}

class CreatorA : Creator {
    override fun createProduct(): Product {
        return ProductA()
    }
}