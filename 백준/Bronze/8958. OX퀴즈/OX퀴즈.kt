import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val tc = nextInt()

    repeat(tc) {
        val ox = next()
        var count = 0
        var sum = 0

        for(j in ox.indices) {
            if(ox[j] == 'O') {
                count++
                sum += count
            } else count = 0

        }
        println(sum)
    }
}