fun main() {
    sayHello()
    sayHello("Dawid")
    sayHello(greeting = "Hi", who = "me")

    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("my data")
    } else {
        noInternetConnection()
    }
}

fun sayHello() {
    println("Hello World")
}

fun sayHello(name: String) {
    println("Hello $name")
}

fun noInternetConnection() {
    println("No internet connection")
}

fun sayHello(greeting: String, who: String): Unit {
    println("$greeting, $who")
}

fun getData(data: String) {
    println("Your data is: $data")
}

