fun main() {
    println(CollatzConjecture.countSteps(12))
}

object CollatzConjecture {
    fun countSteps(input: Int): Int {
        require(input >= 1) { "Only natural numbers are allowed" }
        var steps = 0
        var value = input
        while (value != 1) {
            value = if (value.even) value / 2 else value * 3 + 1
            steps += 1
        }
        return steps
    }
}

private val Int.even: Boolean get() = this % 2 == 0