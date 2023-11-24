import java.util.Scanner

fun main() {
    val tc = Scanner(System.`in`)
    val input = tc.nextLine()
    val len = input.length 
    
    for (i in 0 until len step 10) {
        val end = if(i + 10 < len) i + 10 else len
        println(input.substring(i, end))
    }
}