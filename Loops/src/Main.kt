fun main() {
//    .. means range from 1  to 100
    for (i in 1..100) {
        println(i)
    }

//    from 1 to 99
    for (i in 1 until 100) {
        println(i)
    }
//    from 100 to 1
    for (i in 100 downTo 1) {
        println(i)
    }

    for (i in 1 downTo -10) {
        println(i)
    }

    for (i in 0 until 10 step 2) {
        println(i)
    }
}