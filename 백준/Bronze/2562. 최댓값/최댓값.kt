import java.util.Scanner
import java.util.Collections

fun main() = with(Scanner(System.`in`)) {
    val maxNum = arrayListOf<Int> ()
    
    for (i in 1..9) {
        val input = nextInt()
        maxNum.add(input)
    }
    
    val max = Collections.max(maxNum)
    val num = maxNum.indexOf(max)
    
    println(max)
    println(num + 1)

}