import java.math.BigInteger
fun main() {
    val input = readln().split(" ")
    val n = BigInteger(input[0])
    val m = BigInteger(input[1])
    
    println(n / m)
    println(n % m)
}