package hanghae_Algorithm;
//18번 서울에서 김서방 찾기
//https://programmers.co.kr/learn/courses/30/lessons/12919
public class Day06_04 {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }
}
//참고
//초기 작성시 break 사용하지 않음 조건식과 같이 Kim은 한명뿐이므로 쓸데없이 for문이 추가적으로 동작하지 않음. 실행시간 단축


//다른 사람이 푼 코드 + 라이브러리 사용하여 코드 줄이는게 좋은건 아니라는거 인지
//메모리 공간 손해
//import java.util.Arrays;
//
//public class FindKim {
//    public String findKim(String[] seoul){
//        //x에 김서방의 위치를 저장하세요.
//        int x = Arrays.asList(seoul).indexOf("Kim");
//
//        return "김서방은 "+ x + "에 있다";
//    }
//