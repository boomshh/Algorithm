fun main() {
	val n = readln().toInt()

	var movie = 666
	var count = 0 

	while(count < n) {
		if("666" in movie.toString()) {
			count++
		}
		movie++ 
	}

	println(movie - 1)
}