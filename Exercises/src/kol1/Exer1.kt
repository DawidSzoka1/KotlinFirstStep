package kol1

object Exer1 {
    fun answer() {
        val tab = Array<Any?>(10) { null }
        for (i in 0..9) {
            tab[i] = readln()
            try {
                tab[i] = tab[i].toString().toInt()
            }catch (e: NumberFormatException) {
                continue
            }
        }
        var countNum = 0
        var countWords = 0
        for (value in tab) {
            if (value is Int) {
                countNum++
            }else if (value is String) {
                countWords++
            }
        }
        println("Ilosc liczb: $countNum,\nIlosc slow: $countWords")
    }
}