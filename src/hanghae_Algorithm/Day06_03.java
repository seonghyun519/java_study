package hanghae_Algorithm;
//17번 문자열 다루기 기본
//https://programmers.co.kr/learn/courses/30/lessons/12918
public class Day06_03 {
    public boolean solution(String s) {
        boolean answer = false;
        if (!(s.length() == 4 || s.length() == 6)) {
            return answer;
        }
        for (int i = 0; i < s.length(); i++) {
            answer = '0' <= s.charAt(i) && '9' >= s.charAt(i) ? true : false;
            if (answer == false) {
                return answer;
            }
        }return answer;
    }
}
//문제 잘 읽기..
//length에서 헤맴.. 테스트 5,6 / 28,29 결과에서 걸림..

//다른 사람 풀이
//class Solution {
//    public boolean solution(String s) {
//        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
//    }
//}