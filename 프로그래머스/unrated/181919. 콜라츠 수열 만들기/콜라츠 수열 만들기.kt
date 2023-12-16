class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()

        var currentNumber = n
        while (currentNumber != 1) {
            answer.add(currentNumber)

            if (currentNumber % 2 == 0) {
                currentNumber /= 2
            } else {
                currentNumber = 3 * currentNumber + 1
            }
        }
        
        answer.add(1)

        return answer.toIntArray()
    }
}
