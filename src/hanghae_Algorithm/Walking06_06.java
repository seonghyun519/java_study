package hanghae_Algorithm;
import java.util.Arrays;
//20번째 완주하지 못한 선수
//https://programmers.co.kr/learn/courses/30/lessons/42576
public class Walking06_06 {
    public String solution(String[] participant, String[] completion) {
        int i = 0;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (String a : completion) {
            if (!(a.equals(participant[i]))) {
                if (a.equals(participant[i+1])) {
                    return participant[i];
                }else {
                    return participant[i+1];
                }
            }
            i++;
        }
        return participant[i];
    }
}


//초기 버전
//public String solution(String[] participant, String[] completion) {
//    String answer = "";
//    int i = 0;
//    Arrays.sort(participant);
//    Arrays.sort(completion);
//    for (String a : completion) {
//        if (!(a.equals(participant[i]))) {
//            if (a.equals(participant[i+1])) {
//                return participant[i];
//            }else {
//                return participant[i+1];
//            }
//        }
//        i++;
//    }
//    return participant[i];
//}