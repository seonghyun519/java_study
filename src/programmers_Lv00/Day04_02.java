package programmers_Lv00;
//짝수와 홀수
public class Day04_02 {
    public String solution(int num) {
        String answer = (num%2 == 0) ? "Even":"Odd";
        return answer;
    }
}