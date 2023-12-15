import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tc = br.readLine().toInt()
    var result = 1
    for(i in 1..tc) {
        result *= i
        if(tc == 0) {
            result = 1
        }
    }
    println(result)

}