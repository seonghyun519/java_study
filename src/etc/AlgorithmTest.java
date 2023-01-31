package etc;

public class AlgorithmTest {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i]>=29){
                answer += 21- arr1[i]; //체크인 미체크로 인한 시간 조정
            }else{
                answer += arr2[i] -arr1[i]; //정상 처리
            }
        }
        return answer;
    }
}
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
//        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
//        System.out.println(s.solution(arr1, arr2));
//    }