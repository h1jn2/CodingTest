import java.util.Stack

fun main() {
    val countOfCases = readln().toInt()
    val answers = mutableListOf<String>()
    repeat(countOfCases) {
        val input = readln()
        val output = reverse(input)
        answers.add(output)
    }
    answers.forEach {
        println(it)
    }
}

private fun reverse(input: String): String {
    val output = StringBuilder()
    for (word in input.split(" ")) {
        val stack = Stack<Char>()
        for (char in word) {
            stack.push(char)
        }
        repeat(stack.size) {
            output.append(stack.pop())
        }
        output.append(" ")
    }
    return output.toString()
}