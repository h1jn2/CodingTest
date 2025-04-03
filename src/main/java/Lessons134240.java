import java.util.ArrayList;

public class Lessons134240 {
    public String solution(int[] food) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < (food[i] / 2); j++) {
                list.add(String.valueOf(i));
            }
        }

        list.add("0");

        for (int i = list.size()-2; i >= 0; i--) {
            list.add(list.get(i));
        }

        for (String num: list) {
            answer += num;
        }

        return answer;
    }
}
