fun main() {
    val n = readln().toInt()

    for(num in n downTo 4) {
        if(num.toString().all { it == '4' || it == '7' }) {
            println(num)
            return
        }
    }
}