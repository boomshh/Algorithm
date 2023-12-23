import java.lang.StringBuilder

fun main() {
    val tc = readln().toInt()
    var strs = StringBuilder() 
    
    for(i in 1..tc) {
        val str = readln()
        
        val char = str.split(" ")
        
        for(c in char) {
            strs.append(c.reversed() + " ")
        }
        strs.append("\n")
    }
    
    println(strs.toString())
}