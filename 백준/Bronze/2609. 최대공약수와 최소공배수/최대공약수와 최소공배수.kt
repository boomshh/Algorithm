import java.util.Scanner 

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    
    val gcd = gcd(a, b)
    val lcm = lcm(a, b)
    
    println(gcd)
    println(lcm)
}

fun gcd(a: Int, b: Int) : Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun lcm(a: Int, b: Int) : Int {
    return if (a == 0 || b == 0) 0 else (a * b) / gcd(a, b)
}