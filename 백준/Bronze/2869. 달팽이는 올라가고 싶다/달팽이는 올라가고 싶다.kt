import kotlin.math.ceil

fun main() {
    val (a,b,v) = readln().split(" ").map { it.toInt() }
    val result = ceil((v - b).toDouble() / (a - b)).toInt()

    print(result)
}