class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        for(i in 1 until arr.size) {
            answer = lcm(answer, arr[i])
        }
        return answer
    }
}

fun main() {
    val a = readln().split(",").map { it.toInt() }
    var b = intArrayOf()
    b += a

    val c = Solution()

    println(c.solution(b))
}

fun gcd(a : Int, b : Int) : Int {
    return if(b == 0) a else gcd(b, a % b)
}

fun lcm(a : Int, b : Int) : Int {
    return a * b / gcd(a, b)
}

