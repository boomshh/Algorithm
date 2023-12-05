import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val (a, b, c) = readln().split(' ').map{ it.toLong()}
    println(a + b + c)
}