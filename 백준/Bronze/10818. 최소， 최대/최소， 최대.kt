import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    var nums = ArrayList<Int> ()
    
    for (i in 1..num) {
        nums.add(nextInt())
    }
    
    println("${nums.min()} ${nums.max()}")
}