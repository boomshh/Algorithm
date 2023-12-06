fun main() {
    val (n, m) = readln().split(" ").map{it.toInt()}
    var nums = IntArray(n)

    for(i in 1..m) {
        val (i, j, k) = readln().split(" ").map{it.toInt()}

        for(index in i - 1 until j) {
            nums[index] = k
        }
    }


    println(nums.joinToString(" "))
}