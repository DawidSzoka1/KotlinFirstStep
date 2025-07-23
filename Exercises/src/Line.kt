import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.random.Random

class Line(var a: Point, var b: Point) {
    constructor(x1: Double, y1: Double, x2: Double, y2: Double) :
            this(Point(x1, y1), Point(x2, y2))

    fun lenght() = sqrt((b.x - a.x).pow(2) + (b.y - a.y).pow(2))

    companion object {
        fun longestLine(lines: List<Line>): Line {
            var result = lines[0]
            for (line in lines) {
                if (line.lenght() > result.lenght()) {
                    result = line
                }
            }
            return result
        }
    }

    override fun toString(): String {
        return "$a -> $b"
    }
}


fun main() {
    val points = mutableListOf<Point>()
    val random = Random
    for (i in 0..9) {
        points.add(Point(random.nextDouble(1.0, 10.0), random.nextDouble(1.0, 10.0)))
        println(points[i])
    }

    val lines = mutableListOf<Line>()
    for (i in 0..9) {
        val point1 = points[random.nextInt(0, points.size / 2)]
        val point2 = points[random.nextInt(points.size / 2 , points.size)]
        lines.add(Line(point1, point2))
    }
    println(Line.longestLine(lines))

}