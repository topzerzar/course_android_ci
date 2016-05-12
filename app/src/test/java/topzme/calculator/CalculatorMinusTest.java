package topzme.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorMinusTest {

    private double firstOperand;
    private double secondOperand;
    private double expected;

    public CalculatorMinusTest(double firstOperand, double secondOperand, double expected) {
        this.secondOperand = secondOperand;
        this.firstOperand = firstOperand;
        this.expected = expected;
    }

    @Test
    public void minus() {
        Calculator calculator = new Calculator();
        assertEquals(this.expected,calculator.addMinus(this.firstOperand, this.secondOperand));
    }

    @Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, 1, 0.0},
                {2, 1, 1.0},
                {2, 3, -1.0},
                {10, 3, 7.0},
        });
    }


}
