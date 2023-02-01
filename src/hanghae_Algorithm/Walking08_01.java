package hanghae_Algorithm;
//27번 콜라츠 추측
//https://programmers.co.kr/learn/courses/30/lessons/12943
public class Walking08_01 {
    public int solution(long num) {
        int answer = 0;
        if (num == 1) {
            return 0;
        }
        while (!(answer >= 500)) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
            if (num == 1) {
                break;
            }
        }
        if (answer == 500) {
            return -1;
        }
        return answer;
    }

}
//입력값:626331 //결과값 -1이 아닌 1로떨어지는 현상
//디버그 진행중 488번째 떨어졌고 오버플로우 확인 매개변수 타입 long으로 변경