import kotlin.reflect.typeOf

fun main() {
    val doubleMaxValue = Double.MAX_VALUE
    val doubleMinValue = Double.MIN_VALUE
    println("doubleMaxValue value: $doubleMaxValue \ndoubleMinValue value: $doubleMinValue")

    val floatMaxValue = Float.MAX_VALUE
    val floatMinValue = Float.MIN_VALUE
    println("floatMaxValue value: $floatMaxValue \nfloatMinValue value: $floatMinValue")
//  default decimal type is double
    val myNumber = 2.5

//  need f in the end or F
//    that dont work
//    val floatNumber: Float = 2.4
    val floatNumber = 3.4f
    println("myNumber value: $myNumber")
}