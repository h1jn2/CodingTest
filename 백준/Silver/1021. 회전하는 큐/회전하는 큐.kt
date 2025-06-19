package coding

import java.util.Deque
import java.util.LinkedList

fun main() {
    val a = readln().split(" ").map { it.toInt() }
    val numList = readln().split(" ").map { it.toInt() }
    val deque: Deque<Int> = LinkedList()
    var count = 0

    repeat(a[0]) {
        deque.add(it + 1)
    }


    for (i in 0 until a[1]) {
        val idx = deque.indexOf(numList[i])
        val middle = deque.size / 2

        if (idx <= middle) {
            repeat(idx) {
                deque.addLast(deque.removeFirst())
                count++
            }


        } else {
            repeat(deque.size - idx) {
                deque.addFirst(deque.removeLast())
                count++
            }
        }
        deque.removeFirst()
    }

    println(count)
}