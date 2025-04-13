class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        String result = "";
        String goalText = "";
        int cards1Cnt = 0;
        int cards2Cnt = 0;
        
        for (int i = 0; i < goal.length; i++) {
            goalText += goal[i];
            if (cards1Cnt < cards1.length) {
                if (goal[i].equals(cards1[cards1Cnt])) {
                    cards1Cnt++;
                    result += goal[i];
                    continue;
                }
            }

            if (cards2Cnt < cards2.length) {
                if (goal[i].equals(cards2[cards2Cnt])) {
                    cards2Cnt++;
                    result += goal[i];
                    continue;
                }
            }
        }

        if (result.equals(goalText)) {
            answer = "Yes";
        } else {
            answer = "No";
        }


        return answer;
    }
}