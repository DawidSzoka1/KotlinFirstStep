import kotlin.math.pow
import kotlin.math.sqrt

object DartsGame {
    private var middle = Point()

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

class Point(val x: Double = 0.0, val y: Double = 0.0) {
    fun distanceBetween(other: Point): Double =
        sqrt((this.x - other.x).pow(2) + (this.y - other.y).pow(2))
}