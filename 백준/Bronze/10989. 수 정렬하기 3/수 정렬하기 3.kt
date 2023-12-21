


fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val tc = br.readLine().toInt()

    val nums = IntArray(10001)

    for(i in 0 until tc) {
        nums[br.readLine().toInt()]++
    }
    br.close()

    for(i in nums.indices) {
        bw.write("$i\n".repeat(nums[i]))
    }
    bw.close()

}