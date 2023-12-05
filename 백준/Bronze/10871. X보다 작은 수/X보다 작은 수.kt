import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val (a, b) = readln().split(" ").map{it.toInt()}
    for(i in 1..a) {
        var n = nextInt()
        if(n < b) print("$n ")
    }
}