class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Cnt = 0;
        int cards2Cnt = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (cards1Cnt < cards1.length && goal[i].equals(cards1[cards1Cnt])) {
                cards1Cnt++;
            } else if (cards2Cnt < cards2.length && goal[i].equals(cards2[cards2Cnt])) {
                cards2Cnt++;
            } else {
            return "No";
        }

        }

        return "Yes";
    }
}