package studyTestCode.solid.solid03_l01;

public class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    @Override
    public boolean isInvalid(int secondNumber) {
        return false;
    }
}