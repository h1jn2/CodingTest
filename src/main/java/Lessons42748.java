import java.util.Arrays;

public class Lessons42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            int[] arr = new int[b - a + 1];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = array[b-j-1];
            }
            Arrays.sort(arr);
            answer[i] = arr[c-1];
        }

        for (int num: answer) {
            System.out.println(num);
        }
        return answer;
    }
}
