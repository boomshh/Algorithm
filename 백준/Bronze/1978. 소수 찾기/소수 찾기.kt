import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)){
    val tc = readln().toInt()

    var nums = mutableListOf<Int>()

    var count = 0

    for(i in 0 until tc) {
        val n = nextInt()
        nums.add(n)
    }

    for(x in nums) {
        if(isPrime(x)) {
            count++
        }
    }


    println(count)
}

fun isPrime(x: Int): Boolean {
    if(x < 2) {
        return false
    }

    for(i in 2..sqrt(x.toDouble()).toInt()) {
        if(x % i == 0) {
            return false
        }
    }

    return true
}
