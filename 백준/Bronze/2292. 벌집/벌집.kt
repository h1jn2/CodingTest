fun main() {
    val input = readLine()!!.toInt()
    var pivot = 1
    var count = 1

    while (pivot < input) {
        pivot += count * 6
        count++
    }

    println(count)
}