object DartsGame {
    private var middle = Point(0.0, 0.0)

    fun calculatePoint(input: Point): Int {
        val distance = input.distanceBetween(middle)
        return when {
            distance <= 1.0 -> 10
            distance <= 5.0 -> 5
            distance <= 10.0 -> 1
            else -> 0
        }
    }
}