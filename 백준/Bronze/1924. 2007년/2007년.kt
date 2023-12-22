fun main() {
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val daysInMonth = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val daysOfWeek = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    var totalDays = y
    for (i in 1 until x) {
        totalDays += daysInMonth[i]
    }

    val dayOfWeek = (totalDays ) % 7

    println(daysOfWeek[dayOfWeek])
}
