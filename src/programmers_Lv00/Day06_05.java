package programmers_Lv00;
//19번 수박수박수박수박수박수?
public class Day06_05 {
    public String solution(int n) {
        String answer = "";
        String s = "수";
        String b = "박";
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                answer += s + b;
            }
            return answer;
        } else {
            for (int i = 0; i < (int) n / 2; i++) {
                answer += "수박";
            }
            return answer += "수";
        }
    }
}