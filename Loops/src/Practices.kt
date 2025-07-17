fun main() {
    var countEven = 0
    for (i in 1..1234) {
        if (i % 2 != 0) {
            continue
        }
        countEven++
        println(i)
    }
    println("Even: $countEven")
}