class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        val a = arr1.size
        val b = arr2.size
        if(a != b) {
            if(a > b) answer += 1
            else answer += -1
        } else if( a == b) {
            if(arr1.sum() > arr2.sum()) answer += 1
            else if(arr1.sum() == arr2.sum()) answer += 0
            else answer += -1
        } 
        return answer
    }
}