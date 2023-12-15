class Solution {
    fun solution(num_list: IntArray): Int {
        var oddSum = 0
        var evenSum = 0

        for (i in num_list.indices) {
            if (i % 2 == 0) {
                evenSum += num_list[i]
            } else {
                oddSum += num_list[i]
            }
        }

        return if (oddSum > evenSum) {
            oddSum
        } else {
            evenSum
        }
    }
}
