package programmers_Lv00;

public class Day04_07 {
    //음양 더하기
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }
        return answer;
    }
}
//부호 *-1로 처리 ssss