package topzme.calculator;

public class MainController {

    Calculator calculator = new Calculator();
    private CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void onAdd(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.addplus(firstOperand, secondOperand)));
    }

    public void onMinus(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.addMinus(firstOperand, secondOperand)));
    }

    public void onMultiply(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.addMultiply(firstOperand, secondOperand)));
        calculator.addMultiply(firstOperand, secondOperand);
    }

    public void onDivide(double firstOperand, double secondOperand) {
        listener.onSuccess(String.valueOf(calculator.addDivide(firstOperand, secondOperand)));
    }
}
