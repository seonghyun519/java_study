package hanghae_Algorithm;
//21번째 이상한 문자 만들기
//https://programmers.co.kr/learn/courses/30/lessons/12930
public class Walking07_01 {
    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                index = 0;
            } else {
                if (index % 2 == 0 && c >= 'a' && c <= 'z') {
                    c = Character.toUpperCase(c);
                } else if (index % 2 == 1 && c >= 'A' && c <= 'Z') {
                    c = Character.toLowerCase(c);
                }
                index++;
            }
            str.append(c);
        }
        return str.toString();
    }
}

//참고 06_02
