fun main() {
    println(Bob.hey("43WETS"))
}

object Bob {
    fun hey(input: String): String {
        val blank = input.isBlank()
        val allLetters = input.filter { it.isLetter() }
        val allCaps = allLetters.all { it.isUpperCase() } && allLetters.isNotEmpty()
        val question = input.trimEnd().endsWith("?")
        return when {
            allCaps && question -> "Calm down, "
            question -> "Sure"
            allCaps -> "dont yell at me"
            blank -> "Fine be that way"
            else -> "Whatever"
        }
    }
}
