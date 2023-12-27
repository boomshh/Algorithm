import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()

    var sum = 0
    var nums = mutableListOf<Int>()

    for(i in a..b) {
        if(isPrime(i)) {
            nums.add(i)
            sum += i
        }
    }

    if(nums.sum() == 0) {
        println(-1)
    } else {
        println(sum)
        println(nums.first())
    }



}

fun isPrime(x:Int) : Boolean {
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