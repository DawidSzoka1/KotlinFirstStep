fun main() {
    println(reverseString("stressed"))
    println("stressed".reversed())
}

fun reverseString(s: String): String {
    var result = ""
    for (i in s.length - 1 downTo 0) {
        result += s[i]
    }
    return result
}