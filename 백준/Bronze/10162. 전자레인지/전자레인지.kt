fun main() {
    val times = readln().toInt()

    val a = times / 300
    val b = (times % 300) / 60
    val c = (times % 60) / 10

    if(times % 10 == 0) {
        println("$a $b $c")
    } else {
        println(-1)
    }

}