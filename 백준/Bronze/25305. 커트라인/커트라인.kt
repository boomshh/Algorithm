import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val (a, b) = readln().split(' ').map { it.toInt() }

    var array = IntArray(0)

    repeat(a) {
        val score = nextInt()
        array += score
    }

    println(array.sortedDescending()[b - 1])
}