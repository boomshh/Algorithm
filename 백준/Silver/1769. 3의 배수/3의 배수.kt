import java.util.Scanner

fun main () = with(Scanner(System.`in`)){
    var n = next()

    var count = 0
    var sum = 0

    while (n.length > 1) {
        sum = 0
        for(i in n.indices) {
            sum += n[i].toString().toInt()
        }
        n = sum.toString()
        count++
    }

    println(count)

    if(n.length == 1) {
        if(n.toInt() % 3 == 0) println("YES")
        else println("NO")
    } else {
        if(sum % 3 == 0) {
            println("YES")
        } else println("NO")
    }



}