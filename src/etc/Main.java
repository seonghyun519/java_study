package etc;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int[] arr = new int[]{500, 100, 50, 10, 5, 1};
        int nowM = 500;
        int money = 1000 - num1;
        int count = 0;
        int index = 0;
        while (!(money == 0)) {
            if (money >= nowM) {
                money = money - nowM;
                count++;
            }else if(money < nowM){
                index++;
                nowM = arr[index];
            }
        }
        System.out.println(count);
    }
}


//다른사람 풀이
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        //백준 5585
//        Scanner sc = new Scanner(System.in);
//        int n = 1000 - sc.nextInt();
//        int cnt = 0;
//        int[] coin = {500, 100, 50, 10, 5, 1};
//        for (int i : coin) {
//            if (n / i != 0) { //0으로 떨어지면 for문 종료
//                cnt += n / i; //나눈 값이 실수일때 int로 변환되어 뒷자리 날라감
//                n %= i; //나머지값을 계산하여 값을 정산해줌
//            }
//        }
//        System.out.println(cnt);
//
//    }
//}