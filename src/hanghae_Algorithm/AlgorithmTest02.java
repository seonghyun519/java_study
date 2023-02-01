package hanghae_Algorithm;

public class AlgorithmTest02 {
    public String solution(String s) {
        String answer = "";
        int MaxNum = 0;
        int MinNum = 999999; //초기값 미스
        String[] strArr = s.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (test(Integer.parseInt(strArr[i]))) {
                MaxNum = Math.max(MaxNum, (Integer.parseInt(strArr[i])));
            } else {
                MinNum = Math.min(MinNum, (Integer.parseInt(strArr[i])));
            }
        }
        answer = MinNum + " " + MaxNum;
        return answer;
    }

    public boolean test(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;

            } else if (count >= 3) {
                return false;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}

//Math.max / Math.min
//## 3번.소수의 개수와 덧셈(상)
//
//        ### **문제 설명**
//
//        문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.str에 나타나는 숫자 중 소수의 최대값과 소수가 아닌 수의 최소값을 찾아 이를"(최소값) (최대값)"형태의 문자열을 반환하는 함수,solution을 완성하세요.
//
//        예를들어 s가"2 3 4 5"라면"4 5"를 리턴하고,"15 3 10 9 7 8"라면"8 7"을 리턴하면 됩니다.
//
//        ---
//
//        ### 제한사항
//
//        -s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
//        -문자열에는 소수가 한개 이상 섞여 있습니다.
//        -문자열에는 소수가 아닌 수가 한개 이상 섞여 있습니다.
//        -음수는 없습니다.