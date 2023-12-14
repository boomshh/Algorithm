import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(' ').map { it.toInt() }

    val str1 = mutableListOf<String>()
    val result = mutableListOf<String>()

    repeat(a) {
        str1.add(br.readLine())
    }

    repeat(b) {
        val c = br.readLine()
        if(str1.contains(c)) {
            result.add(c)
        }
    }
    
    println(result.size)
}