fun main() {
    val br = System.`in`.bufferedReader()

    val nums = mutableListOf<Int>()

    for (i in 0 until 9) {
        nums.add(br.readLine().toInt())
    }
    br.close()
    val numsSum = nums.sum()

    var iIndex = -1
    var jIndex = -1

    loop@ for (i in nums.indices) {
        for (j in i + 1..nums.lastIndex) {
            if (numsSum - (nums[i] + nums[j]) == 100) {
                iIndex = i
                jIndex = j
                break@loop
            }
        }
    }

    nums.removeAt(jIndex)
    nums.removeAt(iIndex)
    nums.sorted().forEach {
        println(it)
    }
}
