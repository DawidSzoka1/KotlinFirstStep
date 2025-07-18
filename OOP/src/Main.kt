fun main() {
    val car1 = Car("Tesla", "", "")
    println(car1.doors)
    car1.move()

    val car2 = Car("Honda", "", "", 2)
    println(car2.doors)
    println(car1.name)
    println(car2.name)
    car1.stop()
    car2.move()

    val user = User("Dawid", "Szoka", 22)
    val wrongUser = User("Tom", lastName = "Szoka", 22)
    val anotherUser = User(age = 2, name = "Honda")
    println(anotherUser)
    println(wrongUser)

}
