
import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val (a, b) = readln().split(" ")

    val A = a.replace("6", "5").toInt() + b.replace("6", "5").toInt()
    val B = a.replace("5", "6").toInt() + b.replace("5", "6").toInt()


    println("$A $B")

}