package studyTestCode.solid.solid04_i01;

public class Calculator {
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}