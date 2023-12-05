import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = readln().toInt()

    if((a % 4 == 0 && a % 100 != 0)) {
        print(1)
    } else if (a % 4 == 0 && a % 400 == 0) {
        print(1)
    } else {
        print(0)
    }
    println()

}