class Solution {
    fun solution(numbers: IntArray): IntArray {
    val answer = IntArray(numbers.size)

    for (i in numbers.indices) {
        answer[i] = numbers[i] * 2
    }

    return answer
    }

}