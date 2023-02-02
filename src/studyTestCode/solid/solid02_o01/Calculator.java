package studyTestCode.solid.solid02_o01;

public class Calculator {
    public Calculator(){

    }

    public int calculator(AbstractOperation operation,int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}
