fun main() {
    val n = readln()
    val requireMoneyList = readln().split(" ").map { it.toInt() }.sorted()
    val money = readln().toInt()
    var start = 0
    var end = requireMoneyList.maxOf { it }
    var result = 0

    while (start <= end) {
        val pivot = (start + end) / 2

        var sumMoney = 0

        requireMoneyList.forEach {
            if (it > pivot) {
                sumMoney += pivot
            } else {
                sumMoney += it
            }
        }

        if (sumMoney > money) {
            end = pivot - 1
        } else {
            start = pivot + 1
            result = pivot
        }
    }
    println(result)
}