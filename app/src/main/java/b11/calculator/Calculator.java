package b11.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("======================================");
        System.out.println("Selamat datang di Kalkulator Sederhana");
        System.out.println("======================================");
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = getInput(scanner);

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = getInput(scanner);

        System.out.println("======================================");
        System.out.println("Pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.println("======================================");
        System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        if (validateOperation(pilihan) && validateDivision(bilangan2, pilihan)) {
            double hasil = CalculatorOperations.calculate(bilangan1, bilangan2, pilihan);
            System.out.println("======================================");
            System.out.println("Hasil: " + hasil);
            System.out.println("======================================");
        }

        scanner.close();
    }

    public static short getInput(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) {
                    return (short) input; // Mengonversi int ke short
                } else {
                    System.out.println(
                            "Error: Masukkan angka dalam rentang " + Short.MIN_VALUE + " hingga " + Short.MAX_VALUE);
                }
            } else {
                System.out.println("Error: Masukkan angka yang valid");
                scanner.next(); // Meminta ulang user untuk input angka
            }
        }
    }

    public static boolean validateOperation(int operator) {
        if (operator < 1 || operator > 4) {
            System.out.println("Error: Pilihan operator tidak valid");
            return false;
        }
        return true;
    }

    public static boolean validateDivision(int b, int operator) {
        if (operator == 4 && b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
            return false;
        }
        return true;
    }
}
