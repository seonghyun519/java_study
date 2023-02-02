//package hanghae_Algorithm;
////백준 풀이 클래스
////작업 후 옮기자
//
//
//public class AlgorithmTest02 {
//    public int solution1(int num) {
//        int answer = 0;
//        if (!(10<=num && 1000>num)){
//            return answer;
//        }
//        int money = 1000 - num;
//        int[] arr = {500,100,50,10};
//        for (int i = 0; i <arr.length ; i++) {
//            if (money>=arr[i]) {
//                answer += money / arr[i];
//                money %= arr[i];
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args)  {
//        AlgorithmTest02 method = new AlgorithmTest02();
//        int num1 = 550;
//        System.out.println(method.solution1(num1));
//    }
//}