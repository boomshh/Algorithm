import java.time.LocalTime

fun main()  {
    val (a, b) = readln().split(' ').map{ it.toInt() }

    val c = readln().toLong()

    val time = LocalTime.of(a, b).plusMinutes(c)

    println("${time.hour} ${time.minute}")

}