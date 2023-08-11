class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        my_string.toCharArray()
        for (i in my_string) {
            if( i.isDigit()) {
                answer += i.digitToInt()
            }
        }
        answer.sort()
        return answer
    }
}