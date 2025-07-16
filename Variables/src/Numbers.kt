fun main() {
    var number: Double? = null
    val maxInteger = Int.MAX_VALUE
    val minInteger = Int.MIN_VALUE
    println("max integer value: $maxInteger \nmin integer value: $minInteger")

    number = 2147483648.0
    println("Testing values: $number")

    val byteMaxValue = Byte.MAX_VALUE
    val byteMinValue = Byte.MIN_VALUE
    println("byteMaxValue value: $byteMaxValue \nbyteMinValue value: $byteMinValue")

    val shortMaxValue = Short.MAX_VALUE
    val shortMinValue = Short.MIN_VALUE
    println("shortMaxValue value: $shortMaxValue \nshortMinValue value: $shortMinValue")

    val longMaxValue = Long.MAX_VALUE
    val longMinValue = Long.MIN_VALUE
    println("longMaxValue value: $longMaxValue \nlongMinValue value: $longMinValue")

//    default value for number is Int
    val myNumber = 28
}