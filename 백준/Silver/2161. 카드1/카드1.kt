fun main() {
    val card = readln().toInt()

    val array = mutableListOf<Int>()

    for(i in 1..card) {
        array.add(i)
    }

    val list = mutableListOf<Int>()

    while(array.size > 1) {
        list.add(array.removeAt(0))
        array.add(array.removeAt(0))
    }

    list.add(array[0])

    println(list.joinToString(" "))
}