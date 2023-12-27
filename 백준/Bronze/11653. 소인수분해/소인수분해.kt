fun main() {
    var n = readln().toInt()

    val nums = mutableListOf<Int>()
    var a = 2

    while (n > 1) {
        if(n % a == 0) {
            nums.add(a)
            n /= a
        } else a++
    }


    println(nums.joinToString("\n"))
}