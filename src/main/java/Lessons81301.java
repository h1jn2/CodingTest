public class Lessons81301 {
    public int solution(String s) {
        int answer = 0;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numberT = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String result = s;

        for (int i = 0; i < 10; i++) {
            if (s.contains(number[i])) {
                result = result.replace(number[i], numberT[i]);
            }
        }
        answer = Integer.parseInt(result);
        return answer;
    }
}
