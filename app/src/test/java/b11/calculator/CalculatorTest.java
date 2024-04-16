package b11.calculator;

import b11.calculator.Calculator;
import b11.calculator.CalculatorOperations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(4, CalculatorOperations.calculate(2, 2, 1), 0);
    }
    
    private void assertEquals(int i, double calculate, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testSubtraction() {
        assertEquals(3, CalculatorOperations.calculate(5, 2, 2), 0);
    }
    
    @Test
    public void testMultiplication() {
        assertEquals(10, CalculatorOperations.calculate(2, 5, 3), 0);
    }
    
    @Test
    public void testDivision() {
        assertEquals(3, CalculatorOperations.calculate(9, 3, 4), 0);
    }
    
    @Test
    public void testDivisionByZero() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(5, 0, 4), 0);
    }
    
    private void assertEquals(double nan, double calculate, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testInvalidOperator() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(5, 3, 6), 0);
    }
    
}
