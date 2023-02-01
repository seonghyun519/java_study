package etc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("값을 입력하세요");
        StringBuilder t = new StringBuilder(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            System.out.println(t[i]);
        }

    }
}