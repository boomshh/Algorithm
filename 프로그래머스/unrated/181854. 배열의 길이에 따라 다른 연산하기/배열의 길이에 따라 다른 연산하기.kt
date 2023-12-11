class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {

        for(i in arr.indices) {
            if(arr.size % 2 == 1 && i % 2 == 0) {
                arr[i] += n 
            }             
            else if (arr.size % 2 == 0 && i % 2 == 1) {
                arr[i] += n 
            }
        }
        return arr
    }
}