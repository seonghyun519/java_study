package hanghae_Algorithm;
//15번 내적
//https://programmers.co.kr/learn/courses/30/lessons/70128
public class Walking06_01 {
    int answer = 0;
    int temp = 0;

    public int solution(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}

//다른 사람 풀이
//import java.util.stream.IntStream;
//
//class Solution {
//    public int solution(int[] a, int[] b) {
//        return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
//    }
//}