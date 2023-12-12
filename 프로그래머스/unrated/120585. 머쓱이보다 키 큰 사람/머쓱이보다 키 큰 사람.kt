class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        for(i in array.indices) {
            array.sort()
            if(array[i] > height) {
                answer += 1
            } else answer += 0
        }
        return answer
    }
}