package programmers_Lv00;

//24번 정수 제곱근 판별
public class Day07_05 {
    public long solution(long n) {
        long answer = -1;
        long a = (long) Math.sqrt(n);
        if (a * a == n) {
            answer = (a + 1) * (a + 1);
        }
        return answer;
    }
}

//참고
//제곱근과 제곱근 구하기
//https://doompok.tistory.com/7
//Math클래스
//http://www.tcpschool.com/java/java_api_math
//Math클래스 floor메서드 참고
//https://homzzang.com/b/java-161
