import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val tc = readln().toInt()

    var list = ArrayList<Int>()

    for(i in 1..tc) {
        list.add(nextInt())
    }

    val max = list.max()
    val min = list.min()

    println("$min $max")
}