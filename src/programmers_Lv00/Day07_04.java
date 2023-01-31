package programmers_Lv00;

import java.util.Arrays;
import java.util.Comparator;

//24번 정수 내림차순으로 배치하기
public class Day07_04 {
    public long solution(long n) {
        long answer = 0;
        String ss = "";
        String index = "" + n;
        Long[] arr= new Long[index.length()];
        for (int i = 0; i < index.length(); i++) {
            arr[i] =n % 10;
            n /= 10;
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        for (long s : arr) {
            ss += "" + s;
        }
        answer = Long.parseLong(ss);
        return answer;
    }
}
//오름차순 정렬 시 integer타입 이슈
//데이터 타입 Integer와 int의 차이
//https://velog.io/@haileeyu21/TIL-Java-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%83%80%EC%9E%85-Integer%EC%99%80-int%EC%9D%98-%EC%B0%A8%EC%9D%B4
//[Java] int, String 배열 오름차순/내림차순 정렬
//https://bangu4.tistory.com/287
//외 참고 long에서 int로 안전하게 형변환


//다른사람 풀이
//import java.util.*;
//
//class Solution {
//    public long solution(long n) {
//        String[] list = String.valueOf(n).split("");
//        Arrays.sort(list);
//
//        StringBuilder sb = new StringBuilder();
//        for (String aList : list) sb.append(aList);
//
//        return Long.parseLong(sb.reverse().toString());
//    }
//}
