package programmers_Lv00;
//두 정수 사이의 합
public class Day04_04 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a>b){
            for (long i = 0; i <= a-b; i++) {
                long sum = b + i;
                answer += sum;
            }
        }
        for (long i = 0; i <= b-a; i++) {
            long sum = a + i;
            answer += sum;
        }
        return answer;
    }
}

//    public static void main(String[] args) {
//        Solution s = new Solution();
//        long b = s.solution(3,2);
//        System.out.println(""+b);
//    }