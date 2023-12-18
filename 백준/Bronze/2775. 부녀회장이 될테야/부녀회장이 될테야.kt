import java.util.Scanner

fun main () = with(Scanner(System.`in`)) {
    val a = nextInt()

    for(i in 1..a) {
        val k = nextInt()
        val n = nextInt()

        val apt = Array(k + 1) {IntArray(n)}

        for(i in 0 until n) {
            apt[0][i] = i + 1
        }

        for(i in 1..k) {
            for(j in 0 until n) {
                apt[i][j] = apt[i - 1].take(j + 1).sum()
            }
        }
        println(apt[k][n - 1])
    }
}