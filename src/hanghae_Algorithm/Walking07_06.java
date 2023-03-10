package hanghae_Algorithm;

import java.util.ArrayList;
//26번 제일 작은 수 제거하기
//https://programmers.co.kr/learn/courses/30/lessons/12935
public class Walking07_06 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList <Integer> array = new ArrayList<>();
        int MinNum = 2147483646;
        int chk = 0;
        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }
        for (int i = 0; i < arr.length; i++) {
            if (MinNum > arr[i]) {
                MinNum = Math.min(MinNum, arr[i]);
                chk = i;
            }
            array.add(arr[i]);
        }
        array.remove(chk);
        answer = new int[array.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}
