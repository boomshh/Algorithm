fun main() {
    val a = readln()
    var count0 = 0
    var count1 = 0

    if(a[0] == '0') {
        count1++
    } else {
        count0++
    }

    for(i in 1 until a.length) {
        if(a[i] != a[i - 1]) {
            if(a[i] == '0') {
                count1++
            } else {
                count0++
            }
        }
    }

    println(minOf(count0, count1))

}