import kotlin.math.round
import kotlin.math.sqrt
import kotlin.math.abs
class Triangle(val point: Point, val a: Point, val b: Point, val c: Point) {
    init {


        if (isInside()) {
            println("Точка внутри треугольника")
        } else {
            println("Точка вне треугольника")
        }
}

    private fun isInside(): Boolean {
        val areaABC = square(a, b, c)
        val areaPBC = square(point, b, c)
        val areaABP = square(a, b, point)
        val areaAPC = square(a, point, c)

        return (abs(areaABC - (areaPBC + areaABP + areaAPC)) <= 1)
    }

    private fun square(point1: Point, point2: Point, point3: Point): Double {
        val side1 = distancePoint(point1, point2)
        val side2 = distancePoint(point2, point3)
        val side3 = distancePoint(point1, point3)
        val p = (side1 + side2 + side3) / 2
        val s = sqrt(p * (p - side1) * (p - side2) * (p - side3))
        return s
    }

    private fun distancePoint(point1: Point, point2: Point): Double {
        val dx = point1.x - point2.x
        val dy = point1.y - point2.y
        return sqrt(dx * dx + dy * dy)
    }
}