package studyTestCode.solid.solid02_o01;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

        int answer = calculator.calculator(new AddOperation(), firNum, secNum);
        System.out.println(" + answer = " + answer);

        answer = calculator.calculator(new SubstractOperation(), firNum, secNum);
        System.out.println(" - answer = " + answer);

        answer = calculator.calculator(new MultiplyOperation(), firNum, secNum);
        System.out.println(" * answer = " + answer);

        answer = calculator.calculator(new DivideOperation(), firNum, secNum);
        System.out.println(" / answer = " + answer);
    }
}