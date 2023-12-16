import java.io.BufferedReader
import java.io.InputStreamReader

fun main () {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, c) = br.readLine().split(" ").map { it.toLong() }
    
    if( b >= c) {
        println("-1")
    } else {
        val count = (a / (c - b)) + 1
        println(count)
    }

}