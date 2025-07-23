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
    user.favoriteMove = "Movie"
    println(user.favoriteMove)


    println(Calculator.sum(2, 3))
    println(Calculator.countObject)

    val instance = SingeltonClass.getInstance()
    println(instance)
    val instance2 = SingeltonClass.getInstance()
    println(instance2 == instance)
//    call init only the first time then use the same object
    println(SingleObject)
    println(SingleObject)
    println(SingleObject)

//    lazy initialization
//    object will be created when you use it
    val user2 by lazy {
        User("Dawid", "Szoka", 22)
    }
    println(user2)
}
