package hanghae_Algorithm;

//12번 부족한 금액 계산하기
//https://programmers.co.kr/learn/courses/30/lessons/82612
public class Walking05_03 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 0; i < count; i++) {
            sum += price * (i + 1);
            System.out.println(sum);
        }
        answer = (money<sum)?(-sum + money)*-1: 0;
        return answer;
    }
}

//풀고나서 참고
//class Solution {
//    public long solution(long price, long money, long count) {
//        return Math.max(price * (count * (count + 1) / 2) - money, 0);
//    }
//}