import kotlin.math.sqrt

fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }

    for(i in a..b) {
        if(isPrime(i)) {
            println(i)
        }
    }
}

fun isPrime(x: Int) : Boolean{
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