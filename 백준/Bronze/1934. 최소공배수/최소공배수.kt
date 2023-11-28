import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val t = nextInt()
    
    for (i in 1..t) {
        val a = nextInt()
        val b = nextInt()
        
        println(lcm(a, b))
    }
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun lcm(a: Int, b: Int): Int {
    return if(a == 0 || b == 0) 0 else (a * b) / gcd(a, b)
}