package hanghae_Algorithm;
//11번 x만큼 간격이 있는 n개의 숫자
//https://programmers.co.kr/learn/courses/30/lessons/12954
public class Walking05_02 {
    public long[] solution(int x, int n) {
        long sum = 0;
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            sum +=x;
            answer[i] = sum;
        }
        return answer;
    }
}
//sum을 int로 타입 지정해서 태스트 뒷부분 걸림..