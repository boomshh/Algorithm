import java.time.LocalTime
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    
    val time = LocalTime.of(a, b).minusMinutes(45)
    
    println("${time.hour} ${time.minute}")
}