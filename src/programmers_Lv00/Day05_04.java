package programmers_Lv00;
import java.time.LocalDate;
//13번 2016 특정 요일 구하기
public class Day05_04 {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        String answer = date.getDayOfWeek().toString().substring(0, 3);
        return answer;
    }
}
// 참고
// LocalDate와 LocalTime
// http://www.tcpschool.com/java/java_time_localDateTime