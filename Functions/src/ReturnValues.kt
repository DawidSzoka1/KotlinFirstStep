fun main() {
    println(getMax(b = 2, a = 3))
    println(getMin(b = 2, a = 3))
}


fun getMax(a: Int, b: Int): Int {
    return if (a.compareTo(b) == 1) a else b
}

// one line function
fun getMin(a: Int, b: Int) = if (a < b) a else b