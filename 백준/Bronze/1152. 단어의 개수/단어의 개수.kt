fun main() {
    val n = readln().trim().split(" ").toMutableList()
    n.removeAll(listOf(""))
    val m = n.size
    println(m)
}