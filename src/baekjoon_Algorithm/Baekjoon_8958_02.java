package baekjoon_Algorithm;
////https://www.acmicpc.net/problem/8958
//
import java.util.Scanner;
public class Baekjoon_8958_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("횟수 입력");
        String[] strArr = new String[scanner.nextInt()];
        System.out.println("str 값 입력: ");
        scanner.nextLine(); //횟수 입력 엔터 클릭으로 초기값 ""이 입력됨
        for (int i = 0; i < strArr.length; i++) {
//            System.out.println(i+"번째");
            strArr[i] = scanner.nextLine();
        }
        for (int i = 0; i < strArr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) == 'O') {
                    sum++;
                    sum += count;
                    count++;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
