package studyTestCode.solid.solid01_s01;

public class Calculator {

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if (operator.equals("+")) {
            AddFunction addFunction = new AddFunction();
            answer = addFunction.operator(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            MinusFunction minusFunction = new MinusFunction();
            answer = minusFunction.operator(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            MultiplyFunction multiplyFunction = new MultiplyFunction();
            answer = multiplyFunction.operator(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            DivisionFunction divisionFunction = new DivisionFunction();
            answer = divisionFunction.operator(firstNumber, secondNumber);
        }
        return answer;
    }
}

class AddFunction {
    public int operator(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
class MinusFunction {
    public int operator(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}
class MultiplyFunction {
    public int operator(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
class DivisionFunction {
    public int operator(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}