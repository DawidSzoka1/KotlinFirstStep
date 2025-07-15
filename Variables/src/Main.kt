fun main() {
//    val cant be changed
    val name: String = "Dawid"
    var surname = "Szoka"
    surname = "Change"

//    ? allows null value
    var userAge: Int? = 20
    println("Hello $name $surname $userAge!")
    userAge = null
    println("New value of userAge is $userAge")

    val subclassing: Char = 'C'

    println("This is $name $surname from class $subclassing")
}