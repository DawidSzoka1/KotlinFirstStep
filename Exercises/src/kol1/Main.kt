package kol1

fun main() {
//    Exer1.answer()
    val a = A("ala")
    val b = B("Ola", 5)
    val c = C("Zosia", 3.5, 3)
    val tab = arrayOf(a, b, c)
    tab.forEach { println(it) }
}