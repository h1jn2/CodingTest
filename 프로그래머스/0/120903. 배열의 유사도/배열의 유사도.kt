class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (str1 in s1) {
            for (str2 in s2) {
                if (str1.equals(str2)) answer++
            }
        }
        return answer
    }
}