class Car(var name: String, var model: String, var color: String, var doors: Int = 0) {

    fun move() {
        println("Car: $name is moving...")
    }

    fun stop() {
        println("Car: $name has stopped...")
    }
}
