fun main() {
    var arr = IntArray(0)
    repeat(5) {
        val nums = readln().toInt()
        arr += nums
    }

    println(arr.sum() / 5)
    println(arr.sorted()[2])
}