package com.example.laborlab5

class PaymentContext(private var paymentStrategy: PaymentStrategy) {
    // Метод для выполнения стратегии
    fun executePayment(amount: Double) {
        paymentStrategy.pay(amount)
    }

    // Метод для изменения текущей стратегии
    fun setPaymentStrategy(newPaymentStrategy: PaymentStrategy) {
        paymentStrategy = newPaymentStrategy
    }
}