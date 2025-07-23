package openClass

/*
open class allows to inherit that class
open fun allows to override that function
 */
open class Vehicle(val name: String, val color: String, val engines: Int, val doors: Int) {

    open fun move() {
        println("$name move")
    }

    open fun stop() {
        println("$name stop")
    }

    override fun toString(): String {
        return "Vehicle $name, $color, $engines, $doors"
    }
}