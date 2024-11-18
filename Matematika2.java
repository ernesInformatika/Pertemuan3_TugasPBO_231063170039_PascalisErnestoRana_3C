package Pertemuan3Latihan1;

import Pertemuan2tugasPBO.Matematika;
import java.util.Scanner;

public class Matematika2 extends Matematika {

    // Method untuk menghitung modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematika2 matematika2 = new Matematika2();

        System.out.println("Pilih Operasi Matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.print("Masukkan pilihan (1/2/3/4/5): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();

        try {
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil Pertambahan: " + matematika2.pertambahan(a, b));
                    break;
                case 2:
                    System.out.println("Hasil Pengurangan: " + matematika2.pengurangan(a, b));
                    break;
                case 3:
                    System.out.println("Hasil Perkalian: " + matematika2.perkalian(a, b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Hasil Pembagian: " + matematika2.pembagian(a, b));
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case 5:
                    if (b != 0) {
                        System.out.println("Hasil Modulus: " + matematika2.modulus(a, b));
                    } else {
                        System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Kesalahan aritmatika: " + e.getMessage());
        }

        scanner.close();
    }
}
