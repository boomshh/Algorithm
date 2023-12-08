class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val b = num_list.sum() * num_list.sum()
        val c = num_list.reduce { acc, i -> acc * i  }
        
        if(c < b) {
            answer += 1
        } 
        return answer
    }
}