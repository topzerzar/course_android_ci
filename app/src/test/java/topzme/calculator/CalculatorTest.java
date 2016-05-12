package topzme.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class CalculatorTest {

    // Mark-: Arrange
    Calculator calculator = new Calculator();
    // assertEquals(2.0, actualResult, 0); // กำหนดความละเอียด

    @Test
    public void plus() {
        assertEquals(2.0, calculator.addplus(1,1));
    }

    @Test
    public void minus() {
        assertEquals(0.0, calculator.addMinus(1,1));
        assertEquals(1.0, calculator.addMinus(2,1));
        assertEquals(-3.0, calculator.addMinus(1,4));
    }

    @Test
    public void multiply() {
        assertEquals(1.0, calculator.addMultiply(1,1));
    }

    @Test
    public void divide() {
        assertEquals(1.0, calculator.addDivide(1,1));
    }

    @Test(expected = DivideByZeroException.class)
    public void zeroDivide() {
        calculator.addDivide(2,0);
    }

    @Test
    public void zeroTryCacheDivide() {
        try {
            calculator.addDivide(2,0);
            fail("Divide By Zero");
        } catch (DivideByZeroException e) {

        }
    }
}
