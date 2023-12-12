class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        for(i in numbers.indices) {
            answer += numbers[i]
        }
        return answer / numbers.size
    }
}