public class Lessons132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;
        int full = 0;

        while (empty >= a) {
            full = empty / a * b;
            empty = empty % a + full;
            answer += full;
            System.out.println(answer);
        }
        return answer;
    }
}
