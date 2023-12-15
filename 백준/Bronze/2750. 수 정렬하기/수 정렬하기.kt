import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tc = br.readLine().toInt()
    val nums = mutableListOf<Int>()
    for(i in 1..tc) {
        val a = br.readLine().toInt()
        nums.add(a)
    }
    nums.sort()
    println(nums.joinToString("\n"))

}