package hanghae_Algorithm;
//짝수와 홀수
//https://programmers.co.kr/learn/courses/30/lessons/12937
public class Day04_02 {
    public String solution(int num) {
        String answer = (num%2 == 0) ? "Even":"Odd";
        return answer;
    }
}