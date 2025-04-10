import java.util.ArrayList;
import java.util.Collections;

public class Lessons138477 {
    public static void main(String[] args) {
        Lessons138477 obj = new Lessons138477();
        obj.solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            } else {
                if (list.get(0) <=  score[i]) {
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
                answer[i] = list.get(0);
            }
        }

        return answer;
    }
}
