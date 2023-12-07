import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    for(i in 1..n) {
        val m = nextInt()
        val s = next()
        var result = ""

        for(index in s.indices) {
            repeat(m) {
                result += s[index]
            }
        }
        println(result)
    }

}