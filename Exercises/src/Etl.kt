object Etl {

    fun changeFormat(input: Map<Int, Array<Char>>): Map<Char, Int> {
        var result = mutableMapOf<Char, Int>()
        for (key in input.keys) {
            for (value in input.getValue(key)) {
                result[value.lowercaseChar()] = key
            }
        }

        return result
    }
}

fun main() {
    val input: Map<Int, Array<Char>> = mapOf(
        1 to arrayOf('A', 'E', 'I', 'O', 'U'),
        2 to arrayOf('D', 'G'),
        3 to arrayOf('B', 'C', 'M', 'P'),
        4 to arrayOf('F', 'H', 'V', 'W', 'Y'),
        5 to arrayOf('K'),
        8 to arrayOf('J', 'X'),
        10 to arrayOf('Q', 'Z')
    )

    val output = Etl.changeFormat(input)

    println("Output:")
    for ((letter, score) in output) {
        println("$letter -> $score")
    }
}