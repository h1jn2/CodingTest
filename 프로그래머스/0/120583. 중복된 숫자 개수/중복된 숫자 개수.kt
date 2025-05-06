class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer: Int = 0
        array.filter {it == n}.forEach {answer++}
        return answer
    }
}