fun main() {
    println(sum(1, 2, 54, 54, 32, text = "text"))
    sumForEach(1, 2, 3, 4)
}

fun sum(vararg numbers: Int, text: String): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    println(result)
    result = 0
    for (i in 0..numbers.lastIndex) {
        result += numbers[i]
    }
    return result
}

fun sumForEach(vararg numbers: Int) {
    numbers.forEach { println(it) }
}