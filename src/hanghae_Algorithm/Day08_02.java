package hanghae_Algorithm;

//28번 하샤드 수
//https://programmers.co.kr/learn/courses/30/lessons/12947
public class Day08_02 {
    public boolean solution(int x) {
        String b = "" + x;
        String[] str = b.split("");
        int sum = 0;
        for (String i : str) {
            sum += Integer.parseInt(i);
        }
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}