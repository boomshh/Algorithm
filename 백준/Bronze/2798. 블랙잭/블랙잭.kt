import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()

    val cards = IntArray(n)

    for(i in 0 until n) {
        cards[i] = nextInt()
    }

    var result = 0

    for(i in 0 until n - 2) {
        for(j in i + 1 until n) {
            for(k in j + 1 until n) {
                val sum = cards[i] + cards[j] + cards[k]

                if(sum in (result + 1)..m) {
                    result = sum
                }

            }
        }
    }
    println(result)
}