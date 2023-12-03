
fun quadrant(x: Int, y: Int): Int {
    return when {
        x > 0 && y > 0 -> 1
        x < 0 && y > 0 -> 2
        x < 0 && y < 0 -> 3
        x > 0 && y < 0 -> 4
        else -> 0
    }
}

fun main() {
    val x = readln().toInt()
    val y = readln().toInt()

    println(quadrant(x, y))
}