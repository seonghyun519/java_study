package studyTestCode.solid.solid03_l01;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        if (isInvalid(secondNumber)){
            return firstNumber / secondNumber;
        }
        return firstNumber / secondNumber;
    }
    @Override
    public boolean isInvalid(int secondNumber) {
        if (secondNumber == 0) {
            return true;
        }
        return false;
    }
}