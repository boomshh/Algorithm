import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var min = 987654321;
    var sum = 0
    
    for (i in 1..7) {
        val n = readln().toInt()
        if (n % 2 == 1) {
            sum += n
            if(n < min) min = n
        }
    }
    if(sum == 0) println(-1)
    else {
        println(sum)
        println(min)
    }
}