fun main() {
    val mushrooms = List(10) { readLine()!!.toInt() }

    var sum = 0
    var closestSum = 0

    for (i in mushrooms.indices) {
        sum += mushrooms[i]
        if (Math.abs(100 - closestSum) > Math.abs(100 - sum) || (Math.abs(100 - closestSum) == Math.abs(100 - sum) && sum > closestSum)) {
            closestSum = sum
        }
        if (sum >= 100) break
    }

    println(closestSum)
}
