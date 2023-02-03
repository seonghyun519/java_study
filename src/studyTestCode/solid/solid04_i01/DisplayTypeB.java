package studyTestCode.solid.solid04_i01;

// 연산 과정을 포함한 출력
public class DisplayTypeB extends Calculator implements DisplayWithOperator {

    @Override
    public void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = calculate(operation, firstNumber, secondNumber);
        String operator = operation.getOperator();
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
    }
}