package hanghae_Algorithm;

import java.util.Arrays;
//14번 나누어 떨어지는 숫자 배열
//https://programmers.co.kr/learn/courses/30/lessons/12910
public class Walking05_05 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i : arr) {
            if (i % divisor == 0) {
                count++;
                System.out.println("count: " + count);
            }
        }
        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

//참고
//++증감 연산자 해당 행에서는 기존 숫자 유지 할 수 있으며 다음행에서 더해지는 부분 확인
//오름차순
//http://www.tcpschool.com/java/java_api_arrays


//다른 사람 풀이
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//        if(answer.length == 0) answer = new int[] {-1};
//        java.util.Arrays.sort(answer);
//        return answer;
//    }
//}