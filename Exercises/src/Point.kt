import kotlin.math.pow
import kotlin.math.sqrt

class Point(var x: Double, var y: Double) {
    fun distanceBetween(other: Point): Double =
        sqrt((this.x - other.x).pow(2) + (this.y - other.y).pow(2))



    override fun toString(): String {
        return "($x, $y)"
    }
}