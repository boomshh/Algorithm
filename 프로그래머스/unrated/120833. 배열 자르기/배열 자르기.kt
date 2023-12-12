class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val a = numbers.toList().subList(num1, num2 + 1)
        answer += a
        return answer
    }
}