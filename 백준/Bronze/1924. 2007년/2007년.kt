fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val days = intArrayOf(0, 31, 28, 31, 30 ,31,30, 31,31, 30, 31, 30, 31)
    val years = arrayOf("SUN","MON", "TUE", "WED","THU", "FRI", "SAT")

    var totalDays = b

    for(i in 1 until a) {
        totalDays += days[i]
    }

    val dayOfWeek = totalDays % 7

    println(years[dayOfWeek])
}