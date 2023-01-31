package programmers_Lv00;
//자연수 뒤집어 배열로 만들기

import java.util.ArrayList;

public class Day07_03 {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (n > 0) {
            arr.add((int) (n % 10));
            n /= 10;
        }
        answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}

//참고
//https://coding-factory.tistory.com/551
//https://coding-factory.tistory.com/550

//다른 사람 풀이
//String으로 변환 와우~
//class Solution {
//    public int[] solution(long n) {
//        String a = "" + n;
//        int[] answer = new int[a.length()];
//        int cnt=0;
//
//        while(n>0) {
//            answer[cnt]=(int)(n%10);
//            n/=10;
//            System.out.println(n);
//            cnt++;
//        }
//        return answer;
//    }
//}

