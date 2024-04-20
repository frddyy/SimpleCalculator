package b11.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorOperationsTest {  

    // TC01 & TC06 
    @Test
    public void testAddition() {
        assertEquals(10, CalculatorOperations.calculate(8, 2, 1), 0.0, "Addition test failed");
    }  

    // TC02 & TC07
    @Test
    public void testSubtraction() {
        assertEquals(1, CalculatorOperations.calculate(10, 9, 2), 0.0, "Subtraction test failed");
    }

    // TC03 & TC08    
    @Test
    public void testMultiplication() {
        assertEquals(20, CalculatorOperations.calculate(10, 2, 3), 0.0, "Operator Multiplication test failed");
    }

    // TC04 & TC09
     @Test
     public void testDivision() {
         assertEquals(5, CalculatorOperations.calculate(10, 2, 4), 0.0, "Division test failed");
     }

    // TC05 
    @Test
    public void testOutOperator() {
        assertEquals(Double.NaN, CalculatorOperations.calculate(15, 3, 5), 0.0, "Operator Valid");
    }

}
