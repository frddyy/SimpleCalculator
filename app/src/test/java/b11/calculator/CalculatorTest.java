package b11.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    //Test Case Modul Calculate
    @Test
    public void testOperatorAddition() {
        assertEquals(4, CalculatorOperations.calculate(2, 2, 1), 0.0, "Operator Addition test failed");
    }

    @Test
    public void testOperatorSubtraction() {
        assertEquals(3, CalculatorOperations.calculate(5, 2, 2), 0.0, "Operator Subtraction test failed");
    }

    @Test
    public void testOperatorMultiplication() {
        assertEquals(10, CalculatorOperations.calculate(2, 5, 3), 0.0, "Operator Multiplication test failed");
    }

    @Test
    public void testOperatorDivision() {
        assertEquals(3, CalculatorOperations.calculate(9, 3, 4), 0.0, "Operator Division test failed");
    }

    @Test
    public void testOutOperator() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(15, 3, 5), 0.0, "Operator Valid");
    }

    //Test Case Modul Tambah
    @Test
    public void testAddition() {
        assertEquals(10, CalculatorOperations.calculate(8, 2, 1), 0.0, "Addition test failed");
    }

    //Test Case Modul Kurang
    @Test
    public void testSubtraction() {
        assertEquals(1, CalculatorOperations.calculate(10, 9, 2), 0.0, "Subtraction test failed");
    }

    //Test Case Modul Kali
    @Test
    public void testMultiplication() {
        assertEquals(30, CalculatorOperations.calculate(15, 2, 3), 0.0, "Multiplication test failed");
    }

    //Test Case Modul Bagi
    @Test
    public void testDivision() {
        assertEquals(5, CalculatorOperations.calculate(10, 2, 4), 0.0, "Division test failed");
    }

    // Test Case Modul validateDivision
    @Test
    void testDivisionByZeroProducesInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, CalculatorOperations.calculate(5, 0, 4),
                "Division by zero should return POSITIVE_INFINITY");
    }

    @Test
    void testZeroDivisionByZeroProducesNaN() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(0, 0, 4), "0 divided by zero should return NaN");
    }

    // Test Case Modul validateOperation
    @Test
    public void testInvalidOperator() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(5, 3, 6), 0.0, "Invalid operator test failed");
    }
}
