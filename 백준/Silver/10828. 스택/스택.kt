package coding

import java.util.Stack

fun main() {
    val n = readln().toInt()
    val stack = Stack<Int>()

    repeat(n) {
        val orderList = readln().split(" ")
        val order = orderList[0]

        when (order) {
            "push" -> {
                val num = orderList[1].toInt()
                stack.push(num)
            }
            "top" -> {
                if (stack.isEmpty()) println(-1)
                else println(stack.peek())
            }
            "size" -> println(stack.size)
            "empty" -> {
                if (stack.isEmpty()) println(1)
                else println(0)
            }
            "pop" -> {
                if (stack.isEmpty()) println(-1)
                else println(stack.pop())
            }
        }
    }
}