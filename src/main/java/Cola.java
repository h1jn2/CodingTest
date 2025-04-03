public class Cola {

    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.solution(3, 2, 20);
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
