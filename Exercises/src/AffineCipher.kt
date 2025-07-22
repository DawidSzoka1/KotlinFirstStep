import kotlin.math.pow

object AffineCipher {
    private const val M = 26
    fun encryptChar(x: Char, a: Int, b: Int): Char {
        return (((a * ( x.code - 'a'.code) + b) % M) + 'a'.code).toChar()
    }

    fun encryption(word: String, a: Int, b: Int): String {
        var result = ""
        for (i in word) {
            result += this.encryptChar(i, a, b)
        }
        return result
    }

    fun decryptChar(y: Char, a: Int, b: Int): Char {
        val y = y.code - 'a'.code
        val aInv = (0 until 26).first { it * a % M == 1}
        var result = (aInv * (y - b)) % M
        if (result < 0) {
            result += M
        }
        return (result + 'a'.code).toChar()
    }

    fun decryption(word: String, a: Int, b: Int): String {
        var result = ""
        for (i in word) {
            result += decryptChar(i, a, b)
        }
        return result
    }
}

fun main() {
    println(AffineCipher.encryption("test", 5, 7))
    println(AffineCipher.decryption("ybty", 5, 7))
}