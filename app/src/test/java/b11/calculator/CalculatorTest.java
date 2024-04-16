package b11.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(4, CalculatorOperations.calculate(2, 2, 1), 0.0, "Addition test failed");
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, CalculatorOperations.calculate(5, 2, 2), 0.0, "Subtraction test failed");
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, CalculatorOperations.calculate(2, 5, 3), 0.0, "Multiplication test failed");
    }

    @Test
    public void testDivision() {
        assertEquals(3, CalculatorOperations.calculate(9, 3, 4), 0.0, "Division test failed");
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(5, 0, 4), 0.0, "Division by zero test failed");
    }

    @Test
    public void testInvalidOperator() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(5, 3, 6), 0.0, "Invalid operator test failed");
    }
}
