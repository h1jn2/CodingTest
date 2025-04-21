import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] oneArr = {1, 2, 3, 4, 5};
        int[] twoArr = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threeArr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (oneArr[i % oneArr.length] == answers[i]) oneCount++;
            if (twoArr[i % twoArr.length] == answers[i]) twoCount++;
            if (threeArr[i % threeArr.length] == answers[i]) threeCount++;

        }

        int max = Math.max(Math.max(oneCount, twoCount), threeCount);

        if (max == oneCount) list.add(1);
        if (max == twoCount) list.add(2);
        if (max == threeCount) list.add(3);

        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) 
            answer[i] = list.get(i).intValue();
        
        return answer;
    }
}