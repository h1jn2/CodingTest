import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        if (sqrt(n.toDouble()) % 1 == 0.0) return 1
        else return 2
    }
}