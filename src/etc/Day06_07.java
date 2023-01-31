package etc;
//소수 찾기
public class Day06_07 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(163));
    }
}

//소수 갯수 찾기;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        int num1 = 0;
        for (int i = 2; i <= n; i++) {
            if (!((i % 2 == 0|| i % 3 == 0) || (i % 5 == 0|| i % 7 == 0))){
                num++;
                System.out.println(i);
            }

        }
        if (n>=5) {
            num1 =n>=7?4:3;
        }else{
            num1 =n>=3?2:1;
        }
        return num+num1;
    }
}