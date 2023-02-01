package hanghae_Algorithm;
//없는 숫자 더하기
//https://programmers.co.kr/learn/courses/30/lessons/86051
public class Walking04_06 {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            answer -=numbers[i];
        }
        return answer;
    }
}
//45를 코드로 써보려다 안함..