package topzme.calculator;

/**
 * Created by weerapon on 5/11/16.
 */
public class Calculator {
    public double addplus(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double addMinus(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double addMultiply(double firstOperand, double secodeOperand) {
        return firstOperand * secodeOperand;
    }


    public double addDivide(double firstOperand, double secondOperand) {
        if (secondOperand == 0) {
            throw  new DivideByZeroException();
        }

        return firstOperand / secondOperand;
    }
}
