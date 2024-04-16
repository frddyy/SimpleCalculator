package b11.calculator;
public class CalculatorOperations {
    public static double calculate(int a, int b, int operator) {
        switch (operator) {
            case 1:
                return tambah(a, b);
            case 2:
                return kurang(a, b);
            case 3:
                return kali(a, b);
            case 4:
                return bagi(a, b);
            default:
                return Double.NaN; // Tidak perlu karena sudah divalidasi di Calculator
        }
    }
    
    private static double tambah(int a, int b) {
        return a + b;
    }

    private static double kurang(int a, int b) {
        return a - b;
    }

    private static double kali(int a, int b) {
        return a * b;
    }

    private static double bagi(int a, int b) {
        return a / (double) b; // Validasi pembagi nol sudah dilakukan di Calculator
    }
}
