import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(10, 20, 200.0,2.00);
    }

    @Test
    public void add() {
        assertEquals(30, calculator.add());
    }
    @Test
    public void sutract() {
        assertEquals(10, calculator.subtract());
    }
    @Test
    public void multiply() {
        assertEquals(200, calculator.multiply());
    }
    @Test
    public void devide() {
        assertEquals(100.0, calculator.devide(), 0.01);
    }
}
