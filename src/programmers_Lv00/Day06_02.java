package programmers_Lv00;
//16번 문자열 내 p와 y의 개수
public class Day06_02 {
    boolean solution(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        s = s.toLowerCase();
        boolean answer = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='y'||s.charAt(i)=='p'){
                if (s.charAt(i) == 'y') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            }
            answer = cnt1==cnt2? true:false;
        }return answer;
    }
}

//참고
//대소문자 변경
//https://codechacha.com/ko/java-string-touppercase-lowercase/