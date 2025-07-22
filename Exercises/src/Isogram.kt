object Isogram {

    fun isIsogram(word: String): Boolean {
        if (word.isBlank()) return false
        var letters = word.filter { it.isLetter() }.lowercase()
        return letters.length == letters.toSet().count()
    }
}

fun main() {
    println(Isogram.isIsogram("s         a"))
}