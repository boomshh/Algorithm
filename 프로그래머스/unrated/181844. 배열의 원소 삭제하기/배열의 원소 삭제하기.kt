class Solution {
    fun solution(arr: IntArray, delete_list: IntArray): IntArray {
        val delete = delete_list.toHashSet()

        var result = mutableListOf<Int>()

        for(element in arr) {
            if(element !in delete) {
                result.add(element)
            }
        }
        return result.toIntArray()
    }
}