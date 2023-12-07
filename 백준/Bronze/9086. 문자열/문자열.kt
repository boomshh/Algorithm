import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    for(i in 1..n) {
        val b = next()
        println("${b.first()}${b.last()}")
    }


}