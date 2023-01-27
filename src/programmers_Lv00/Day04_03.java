package programmers_Lv00;
//가운데 글자 가져오기
public class Day04_03 {
    public String solution(String s) {
        String answer = "";
        int s_len = s.length();
        int s_half = (int) s_len / 2;
        if (s_len % 2 == 0) {
            answer = s.substring(s_half - 1, s_half + 1);
        } else {
            answer = s.substring(s_half, s_half + 1);
        }
        return answer;
    }
}