public class Lessons42748 {

    public static void main(String[] args) {
        Lessons42748 lessons42748 = new Lessons42748();
        lessons42748.solution(3, 2, 20);
    }

    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;
        int full = 0;

        while (empty >= a) {
            full = empty / a * b;
            empty = empty % a + full;
            answer += full;
        }
        return answer;
    }
}
