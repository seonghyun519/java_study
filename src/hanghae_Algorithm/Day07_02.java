package hanghae_Algorithm;
//22번째 자릿수 더하기
//https://programmers.co.kr/learn/courses/30/lessons/12931
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
