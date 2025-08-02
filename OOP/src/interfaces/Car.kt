package interfaces

import java.awt.Color

open class Car(val name: String, val color: String): Vehicle, Door {
    override fun move() {
        println("$name move")
    }

    override fun stop() {
        println("$name stop")
    }

    override fun info() {
        println("$name info")
    }

    override fun startEngine() {
        println("$name startEngine")
    }

    override fun amount() {
        println("amount of doors")
    }

    override fun open() {
        println("$name open doors")
    }

    override fun close() {
        println("$name close doors")
    }

    fun race(secondCar: Car) {
        println("$name race ${secondCar.name}")
    }
}

fun main() {
    val car = Car("Car", "blue")
    car.race(object: Car("car2", "red") {

    })

}