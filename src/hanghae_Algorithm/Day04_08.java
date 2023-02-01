package hanghae_Algorithm;
//평균 구하기
//https://programmers.co.kr/learn/courses/30/lessons/12944
public class Day04_08 {
    public double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = answer / arr.length;
        return answer;
    }
}

