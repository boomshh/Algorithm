fun main(args: Array<String>) {
		val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    
    val repeat1 = s1.repeat(a)
    
    println("$repeat1")
}