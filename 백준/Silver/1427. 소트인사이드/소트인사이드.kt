fun main() {
    var st = ""
    val a = readln().toInt()
    val b = a.toString().toCharArray().sortedDescending().joinToString("").toInt()
    println(b)
}