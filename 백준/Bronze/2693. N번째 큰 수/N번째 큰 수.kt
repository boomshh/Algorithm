import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val tc = readln().toInt()
    var array = IntArray(10)

    for(i in 1..tc) {

        for(j in array.indices) {
            val num = nextInt()
            array[j] = num

        }

        println(array.sortedDescending()[2])
    }

}