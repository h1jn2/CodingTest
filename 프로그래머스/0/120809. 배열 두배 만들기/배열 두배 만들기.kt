class Solution {
    fun solution(numbers: IntArray): IntArray {
        for ((index, value) in numbers.withIndex()) {
            numbers[index] = value * 2
        }
        return numbers
    }
}