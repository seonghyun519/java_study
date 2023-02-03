package studyTestCode.solid.solid04_i01;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public String getOperator() {
        return "/";
    }
}