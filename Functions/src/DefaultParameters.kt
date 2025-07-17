fun main() {
    sendMessage("Dawid", reciver = "Tom")
    sendMessage("Dawid", "My custom message", "Tom")
}

// we can mix parameters
fun sendMessage(name: String, message: String = sendText(), reciver: String) {
    println("Sending message $name to $reciver: \n$message")
}

fun sendText() = "Some text"

