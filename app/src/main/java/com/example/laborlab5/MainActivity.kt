package com.example.laborlab5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//fun main() {
//    // Использование ConcreteCreatorA
//    val creatorA: Creator = CreatorA()
//    val productA: Product = creatorA.createProduct()
//    println("CreatorA: ${productA.getDescription()}")
//
//    // Использование ConcreteCreatorB
//    val creatorB: Creator = CreatorB()
//    val productB: Product = creatorB.createProduct()
//    println("CreatorB: ${productB.getDescription()}")
//}

//fun main() {
//
//    val subject = Subject()
//
//    val observerA = ObserverA()
//    val observerB = ObserverB()
//    // создаем
//    subject.addObserver(observerA)
//    subject.addObserver(observerB)
//
//    subject.notifyObservers("Hello, observers!")
//
//    // Удаляем одного из подписчиков
//    subject.removeObserver(observerA)
//
//    // Изменение после удаления подписчика
//    subject.notifyObservers("ObserverA is no longer subscribed.")
//}

//fun main() {
//    // Создаем объекты стратегий
//    val creditCardStrategy = CreditCardPaymentStrategy("1234-5678-9012-3456", "12/25")
//    val payPalStrategy = PayPalPaymentStrategy("user@example.com")
//
//    // Создаем объект контекста и устанавливаем начальную стратегию
//    val paymentContext = PaymentContext(creditCardStrategy)
//
//    // Выполняем платеж с текущей стратегией (кредитной картой)
//    paymentContext.executePayment(100.0)
//
//    // Изменяем стратегию на PayPal и выполняем платеж
//    paymentContext.setPaymentStrategy(payPalStrategy)
//    paymentContext.executePayment(50.0)
//}

//fun main() {
//    // Создаем базовый компонент
//    val simpleCoffee: Coffee = SimpleCoffee()
//    println("Price: ${simpleCoffee.price()}, Description: ${simpleCoffee.description()}")
//
//    // Декорируем компонент с молоком
//    val milkCoffee: Coffee = MilkDecorator(simpleCoffee)
//    println("Price: ${milkCoffee.price()}, Description: ${milkCoffee.description()}")
//
//    // Декорируем компонент с сахаром
//    val sugarCoffee: Coffee = SugarDecorator(simpleCoffee)
//    println("Price: ${sugarCoffee.price()}, Description: ${sugarCoffee.description()}")
//
//    // Декорируем компонент с молоком и сахаром
//    val milkAndSugarCoffee: Coffee = SugarDecorator(MilkDecorator(simpleCoffee))
//    println("Price: ${milkAndSugarCoffee.price()}, Description: ${milkAndSugarCoffee.description()}")
//}

//fun main() {
//    // Создаем объекты команд
//    val light = light1()
//    val lightOnCommand = LightOnCommand(light)
//    val lightOffCommand = LightOffCommand(light)
//
//    // Создаем объект-инвокер
//    val remoteControl = RemoteControl()
//
//    // Устанавливаем команды в инвокер
//    remoteControl.setCommand(lightOnCommand)
//
//    // Нажимаем кнопку на пульте, что приводит к выполнению команды включения света
//    remoteControl.pressButton()
//
//    // Устанавливаем другую команду в инвокер
//    remoteControl.setCommand(lightOffCommand)
//
//    // Нажимаем кнопку на пульте, что приводит к выполнению команды выключения света
//    remoteControl.pressButton()
//}