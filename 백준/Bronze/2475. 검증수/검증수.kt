fun main() {
    var num = readLine()!!.split(" ").map {it.toInt()}
    var sum = 0
    num.forEach {
      sum += it * it
    }
    println("${sum%10}")
}