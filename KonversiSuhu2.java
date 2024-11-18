package Pertemuan3Latihan2;

import java.util.Scanner;

public class KonversiSuhu2 extends KonversiSuhu {

    public double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KonversiSuhu2 konversi = new KonversiSuhu2();

        System.out.println("Pilih Konversi Suhu:");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Celcius ke Reamur");
        System.out.println("3. Fahrenheit ke Reamur");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan suhu dalam Celcius: ");
                double celciusToF = scanner.nextDouble();
                System.out.println("Suhu dalam Fahrenheit: " + konversi.celciusToFahrenheit(celciusToF));
                break;
            case 2:
                System.out.print("Masukkan suhu dalam Celcius: ");
                double celciusToR = scanner.nextDouble();
                System.out.println("Suhu dalam Reamur: " + konversi.celciusToReamur(celciusToR));
                break;
            case 3:
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println("Suhu dalam Reamur: " + konversi.fahrenheitToReamur(fahrenheit));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
