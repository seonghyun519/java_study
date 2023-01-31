package programmers_Lv00;
//22번째 자릿수 더하기
public class Day07_02 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10; //int 형변환 되네?
        }
        return answer;
    }
}
