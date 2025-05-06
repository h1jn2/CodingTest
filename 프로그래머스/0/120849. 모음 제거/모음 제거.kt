class Solution {
    fun solution(my_string: String): String {
        var answer = my_string
        answer = answer.replace("a", "")
        answer = answer.replace("e", "")
        answer = answer.replace("i", "")
        answer = answer.replace("o", "")
        answer = answer.replace("u", "")
        return answer
    }
}