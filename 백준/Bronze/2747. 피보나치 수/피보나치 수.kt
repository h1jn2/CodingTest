package coding

fun main() {
    val input = readln().toInt() - 1
    var first = 0
    var second = 1
    var third = 1


    repeat(input) {
        third = fibonacciNum(first, second)
        first = second
        second = third
    }
    println(third)
}

fun fibonacciNum(first: Int, second: Int): Int {
    return first + second
}