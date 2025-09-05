fun main() {
    val input = readLine()!!.toInt()
    val len = input.toString().length
    val min = (input - len * 9)
    var result = 0

    for (i in min .. input) {
        var sum = i
        var num = i

        while (num > 0) {
            sum += num % 10
            num /= 10
        }

        if (sum == input) {
            result = i
            break
        }
    }

    println(result)
}