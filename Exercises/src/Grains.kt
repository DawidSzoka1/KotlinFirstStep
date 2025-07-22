import java.math.BigInteger

object Grains {
    private const val NUMBER_OF_SQUARES = 64
    fun totalNumber(): BigInteger {

       return numberOfGrains(NUMBER_OF_SQUARES)
    }

    fun numberOfGrains(square: Int): BigInteger {
        return BigInteger.valueOf(2).pow(square)
    }
}

fun main() {
    println(Grains.totalNumber())
}