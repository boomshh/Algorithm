fun main() {
    var tc = readln().toInt()
    var a = tc / 10
    var b = tc % 10
    var count = 1
    var num = a + b

    while(tc != 0) {
        a = b
        b = num % 10
        num = a + b
        if(tc == (a.toString() + b.toString()).toInt()) break
        count++

    }

    print(count)

}