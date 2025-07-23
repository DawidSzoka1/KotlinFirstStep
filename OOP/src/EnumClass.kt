enum class EnumClass(var value: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 30),
    WEST("west", 40);

    fun printDate() {
        println("$value: ${distance}km")
    }


}

fun main() {
    EnumClass.entries.forEach {
        it.printDate()
    }
// valueOf is looking for EnumClass.east the string that we pass
    val direction = EnumClass.valueOf("east".uppercase())

    when (direction) {
        EnumClass.SOUTH -> println("S is our direction")
        EnumClass.EAST -> println("East is our direction")
        EnumClass.WEST -> println("W is our direction")
        EnumClass.NORTH -> println("N is our direction")
        else -> println("Unknown direction")
    }


}