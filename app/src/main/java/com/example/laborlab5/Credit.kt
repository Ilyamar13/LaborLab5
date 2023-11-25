package com.example.laborlab5

class CreditCardPaymentStrategy(private val cardNumber: String, private val expirationDate: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using credit card $cardNumber with expiration date $expirationDate.")
    }
}

class PayPalPaymentStrategy(private val email: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using PayPal account associated with $email.")
    }
}