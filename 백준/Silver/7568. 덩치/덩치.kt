fun main() {
    val tc = readln().toInt()
    val arr = mutableListOf<Pair<Int, Int>>()
    val rank = IntArray(tc) {1}

    for(i in 0 until tc) {
        val (weight, height) = readln().split(' ').map { it.toInt() }
        arr.add(weight to height)
    }


    for(i in 0 until tc) {
        for(j in 0 until tc) {
            if(arr[i].first > arr[j].first && arr[i].second > arr[j].second){
                rank[j]++
            }
        }
    }

    println(rank.joinToString(" "))
}