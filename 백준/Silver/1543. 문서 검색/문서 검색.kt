import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val word = nextLine()
    val wo = nextLine()

    var count = 0
    var index = 0

    while(index <= word.length - wo.length) {
        if(word.substring(index, index + wo.length) == wo) {
            count++
            index += wo.length
        } else {
            index++
        }
    }

    println(count)
}