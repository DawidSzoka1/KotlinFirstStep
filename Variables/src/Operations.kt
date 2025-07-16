fun main() {
    val x = 15f
    var y = 10.0

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x / y = ${x / y}")
    println("x * y = ${x * y}")
    println("x % y = ${x % y}")
    y += 2
    y -= 2
    y *= 4
    y /= 3
    y--
    y++
    println("y: $y")
    println(--y)
    println(y--)
    println(y)

    val isActive = false
    val isLogged: Boolean? = null
    if (isActive) {
        println("I'm active")
//        and checks all parameters while && or || skips when first give the answer
    } else if (isLogged == null || isLogged) {
        println("I'm inactive")
    }

//    last thing will be the value the value in each if block can by different type 
    val ifValue = if (isLogged == true) {
        println("I'm true")
        "this is text 1"
    } else {
        "this is text 2"
        6
    }
    println("IfValue is $ifValue")
}