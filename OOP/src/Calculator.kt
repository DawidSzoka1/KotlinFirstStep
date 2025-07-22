class Calculator {

    init {
        Calculator.countObject++
    }
    //    making static functions
    companion object {
        var countObject = 0
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

}