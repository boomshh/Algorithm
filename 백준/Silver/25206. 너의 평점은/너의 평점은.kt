import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var answer = 0.0
    var scoreSum = 0.0
    var aTime = 0.0
    for (i in 1..20) {
        val name = next()
        val score = nextDouble()
        val a = next()


        val result: Double = when(a) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            "F" -> 0.0
            "P" -> continue
            else -> {99.9}
        }
        aTime += result * score

        scoreSum += score

    }

    answer += aTime / scoreSum
    println(answer)
}