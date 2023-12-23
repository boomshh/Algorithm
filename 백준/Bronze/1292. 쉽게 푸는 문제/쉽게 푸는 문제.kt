fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }
    val array = arrayListOf<Int>()

    for(i in 1..100) {
        for(j in 1..i) {
            array.add(i)
        }
    }
    val result = array.subList(a - 1, b).sum()
    print(result)
}