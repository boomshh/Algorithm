class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var sum = ""
        var sum1 = ""

        for(i in num_list.indices) {
            
            if(num_list[i] % 2 == 1) {
                sum += num_list[i]
            } else {
                sum1 += num_list[i]
            }
        }
        answer += sum.toInt() + sum1.toInt()
        return answer
    }
}

