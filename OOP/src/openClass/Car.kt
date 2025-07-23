package openClass

class Car(name: String, color: String,  engines: Int,  doors: Int) : Vehicle(name, color, engines, doors) {
    override fun move() {
        println("Car $name is moveing")
    }

    override fun stop() {
        println("Car $name is stopping")
    }
}