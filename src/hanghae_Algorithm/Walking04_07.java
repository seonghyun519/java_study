package hanghae_Algorithm;
//7번째 음양 더하기
//https://programmers.co.kr/learn/courses/30/lessons/76501
public class Walking04_07 {
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