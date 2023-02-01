package hanghae_Algorithm;
//19번 수박수박수박수박수박수?
//https://programmers.co.kr/learn/courses/30/lessons/12922
public class Walking06_05 {
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