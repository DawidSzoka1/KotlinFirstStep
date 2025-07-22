import kotlin.math.pow

object EliudEggs {
    fun fromBinaryToDecimal(input: String): Int {
        var result = 0
        var power = 0
        for (i in input.length - 1 downTo 0) {
            if (input[i] == '1') {
                result += 2.0.pow(power).toInt()
            }
            power += 1
        }
        return result
    }

    fun onesInBinary(input: String): Int {
        var result = 0
        for (i in input) {
            if (i == '1'){
                result += 1
            }
        }
        return result
    }

    fun countEggs(input: Array<String>): Int {
        var binaryString = ""
        for (i in input) {
            if (i == "Egg") {
                binaryString += "1"
            } else {
                binaryString += "0"
            }
        }
        return this.fromBinaryToDecimal(binaryString)
    }
}

fun main() {
    println(EliudEggs.countEggs(arrayOf("Egg" ,"", "Egg", "Egg", "", "", "Egg")))
}