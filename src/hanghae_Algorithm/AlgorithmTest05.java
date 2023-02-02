package hanghae_Algorithm;

import java.util.Arrays;
public class AlgorithmTest05 {
    public char[][] solution(int N, char[][] ary) {
//        int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
//        int[] y = {0, 0, 1, -1, 1, -1, 1, -1};
        char[][] answer = new char[N][N];
        int[] index = new int[N]; //2차원 배열의 지뢰 갯수 표기 체크  ///두번째 for문으로 성공시 필요없음
        int[][] result = new int[N][N]; //
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length; j++) {
                if (ary[i][j] >= '0' && ary[i][j] < '9') {
                    index[i] = ary[i][j];
                }
            }
        }
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                if (ary[i][j] >= '0' && ary[i][j] < '9') {
                    Character.getNumericValue(ary[i][j]); //숫자변환
                    if (!(i == 0)) { //8방면 더하기
                        result[i - 1][j - 1] += Character.getNumericValue(ary[i][j]);
                        result[i - 1][j] += Character.getNumericValue(ary[i][j]);
                    }
                    if (!(i == ary.length)) {
                        result[i + 1][j] += Character.getNumericValue(ary[i][j]);
                    }
                    if (!(j == 0)) {
                        result[i + 1][j - 1] += Character.getNumericValue(ary[i][j]);
                        result[i][j - 1] += Character.getNumericValue(ary[i][j]);
                    }
                    if ((j == ary.length))
                        result[i - 1][j + 1] += Character.getNumericValue(ary[i][j]);
                        result[i][j + 1] += Character.getNumericValue(ary[i][j]);
                        result[i + 1][j + 1] += Character.getNumericValue(ary[i][j]);
                }
            }
        }
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                answer[i][j] = (result[i][j]<10?(char) (result[i][j]+'0'):'M');
            }
        }
        return answer;
    }
    //* 반영안함 ㅠ

    public static void main(String[] args) {
        AlgorithmTest05 method = new AlgorithmTest05();
        int N = 5;
        char[][] chars =
                {{'1', '.', '.', '.', '.'},
                        {'.', '.', '3', '.', '.'},
                        {'.', '.', '.', '.', '.'},
                        {'.', '4', '.', '.', '.'},
                        {'.', '.', '.', '9', '.'}};
        System.out.println(Arrays.deepToString(method.solution(N, chars)));
    }
}


//import java.util.Arrays;
//
//class Q3__지뢰찾기_좌표 {
//    public char[][] solution(int N, char[][] ary) {
//        int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
//        int[] y = {0, 0, 1, -1, 1, -1, 1, -1};
//        char[][] answer = new char[N][N];
//
//        for (int i = 0; i < answer.length; i++) {
//            for (int j = 0; j < answer[0].length; j++) {
//                answer[i][j] = ary[i][j] == '.' ? find_mine(ary, i, j, x, y) : '*';
//            }
//        }
//
//        return answer;
//    }
//
//    char find_mine(char[][] ary, int i, int j, int[] x, int[] y) {
//        int count = 0;
//        for (int k = 0; k < x.length; k++) {
//            int nx = i + x[k];
//            int ny = j + y[k];
//            if (in_array(nx, ny, ary) && ary[nx][ny] != '.') {
//                count += ary[nx][ny] - '0';
//            }
//        }
//        System.out.println(count);
//        return count > 9 ? 'M' : (char) (count + '0');
//    }
//
//    boolean in_array(int nx, int ny, char[][] ary) {
//        return nx >= 0 && ny >= 0 && nx < ary.length && ny < ary.length;
//    }
//
//    public static void main(String[] args) {
//        Q3__지뢰찾기_좌표 method = new Q3__지뢰찾기_좌표();
//        int N = 4;
//        char[][] chars =
//                {{'2', '.', '.', '.',},
//                        {'.', '.', '9', '.'},
//                        {'.', '3', '.', '2'},
//                        {'.', '4', '.', '.'}};
//        System.out.println(Arrays.deepToString(method.solution(N, chars)));
//    }
//}