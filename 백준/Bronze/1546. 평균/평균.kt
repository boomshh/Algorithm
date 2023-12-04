fun main() {
    val tc = readln().toInt()
    val score = readln().split(" ").map{ it.toDouble()} 
    val max = score.max()
    val sum = score.sumOf{ it / max * 100} / tc
    println(sum)
}