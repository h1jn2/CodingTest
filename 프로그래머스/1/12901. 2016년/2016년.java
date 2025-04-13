import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        LocalDate localDate = LocalDate.of(2016, a, b);
        String[] dayOfWeek = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int dateIndex = localDate.getDayOfWeek().getValue()-1;
        String answer = dayOfWeek[dateIndex];
        return answer;
    }
}