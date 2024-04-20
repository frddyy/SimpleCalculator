package b11.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test 
    public void testValidCalculation() { //TC01
        String input = "10\n2\n3\n"; // Correct: provides two numbers and an operator choice
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Hasil: 20.0"));
    }

    @Test
    public void testInvalidOperandRange() { // TC02
        // Pastikan memberikan input untuk setiap interaksi yang diharapkan metode `main`.
        // Misalnya, jika setelah input yang tidak valid, program meminta pilihan operasi, tambahkan input untuk itu.
        String input = "-32769\n10\n2\n2\n";  // Menambahkan input untuk pilihan operasi (1 = Penjumlahan)
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Error: Masukkan angka dalam rentang"));
    }
    

    @Test
    public void testInvalidOperator() { // TC03
        String input = "3\n300\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Error: Pilihan operator tidak valid"));
    }

    // Implement additional tests for getInput method (TC04, TC05, TC06)
    @Test
    public void testValidIntegerInput() { // TC04
        String input = "10\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Masukkan pilihan Anda (1/2/3/4):"));
    }

    @Test
    public void testNonIntegerInputFirstOperand() { // TC05
        String input = "a\n20\n10\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Error: Masukkan angka yang valid"));
    }

@Test
public void testNonIntegerInputSecondOperand() { // TC06
    // Menambahkan input tambahan setelah input non-integer untuk menangani masukan berikutnya.
    String input = "10\nc\n5\n1\n"; // Menambahkan pilihan operasi untuk menghindari NoSuchElementException
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    Calculator.main(new String[] {});
    assertTrue(outContent.toString().contains("Error: Masukkan angka yang valid"));
}


    // Implement additional tests for validateDivision method (TC07, TC08)
    @Test
    public void testDivisionByZero() { // TC07
        String input = "20\n0\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Error: Pembagian dengan nol tidak dapat dilakukan"));
    }

    @Test
    public void testDivisionWithNonZeroDivisor() { // TC08
        String input = "20\n5\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Hasil: 4.0"));
    }

    // Implement additional tests for validateOperation method (TC09 to TC13)
    @Test
    public void testValidOperatorAddition() { // TC09
        String input = "10\n5\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Hasil: 15"));
    }

    @Test
    public void testValidOperatorSubtraction() { // TC10
        String input = "10\n5\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Hasil: 5.0"));
    }

    @Test
    public void testValidOperatorMultiplication() { // TC11
        String input = "10\n5\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Hasil: 50.0"));
    }

    @Test
    public void testValidOperatorDivision() { // TC12
        String input = "10\n5\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Hasil: 2.0"));
    }

    @Test
    public void testInvalidOperatorSelection() { // TC13
        String input = "10\n5\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Calculator.main(new String[] {});
        assertTrue(outContent.toString().contains("Error: Pilihan operator tidak valid"));
    }
}
