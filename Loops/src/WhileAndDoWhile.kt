fun main() {
    var count = 0
    outer@ while (count < 10) {
        var i = 0
        println("Started")
        inside@ while (i < 5) {
            if (i == 0) break@outer
            println(i)
        }
        count++
        if (count % 2 == 0) {
            continue
        }
        if (count in 3..5) {
            continue
        }
        println(count)

    }

    do {
        println(count)
    } while (count < 10)
}