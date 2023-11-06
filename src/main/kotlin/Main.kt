fun main() {
    println("Данная программа проверяет, находится ли точка в треугольнике:")
    val a = Point(4.0, 5.0)
    val b = Point(8.0, 19.8)
    val c = Point(18.0, 8.8)
    val p = Point(15.1, 10.0)
    val result = Triangle(p, a, b, c)
}
