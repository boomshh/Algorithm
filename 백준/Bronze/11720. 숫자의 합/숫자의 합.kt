import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val tc = BufferedReader(InputStreamReader(System.`in`))
    val a = tc.readLine().toInt()
    val n = tc.readLine()
    var sum = 0
    
    for (i in 0..a - 1){
        sum += n[i].toString().toInt()
    }
    
    println(sum)
}