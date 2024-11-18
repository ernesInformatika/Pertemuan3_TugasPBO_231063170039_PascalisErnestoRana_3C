package Pertemuan2tugasPBO;

import java.util.Scanner;

public class Matematika {

    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematika matematika = new Matematika();

        System.out.println("Pilih Operasi Matematika:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan bilangan pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = scanner.nextInt();

        try {
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil Pertambahan: " + matematika.pertambahan(a, b));
                    break;
                case 2:
                    System.out.println("Hasil Pengurangan: " + matematika.pengurangan(a, b));
                    break;
                case 3:
                    System.out.println("Hasil Perkalian: " + matematika.perkalian(a, b));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println("Hasil Pembagian: " + matematika.pembagian(a, b));
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
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

