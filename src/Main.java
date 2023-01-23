public class Main {
    public static void main(String[] args) {
        programmers pg = new programmers();
        int result = pg.solution(10,5);
    }
}

class programmers {

    int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 % num2;
        return answer;
    }
}