class Solution {
    fun solution(num_list: IntArray): Int {
        for(i in 0 until num_list.size) {
            if(num_list[i] < 0) {
                return num_list.indexOf(num_list[i])
            }
        }

        return -1
    }
}