package dataClasses

data class User(val name: String, val lastName: String, val age: Int)

fun main() {
    val user1 = User("Daw", "Szo", 22)
    println(user1)
    val user2 = User("Daw", "Szo", 22)
    println(user2 == user1)
}