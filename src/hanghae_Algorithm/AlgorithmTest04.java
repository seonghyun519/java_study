package hanghae_Algorithm;

public class AlgorithmTest04 {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        String[] s1 = s.split("");
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("O")){
                count++;
                answer += count;
            }else {
                count = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTest04 method = new AlgorithmTest04();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}