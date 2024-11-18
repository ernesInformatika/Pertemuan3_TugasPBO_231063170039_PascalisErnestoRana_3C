package Pertemuan3Latihan2;

import java.util.Scanner;

public class KonversiSuhu {

    public double celciusToFahrenheit(double celcius) {
        return (celcius * 9 / 5) + 32;
    }

    public double celciusToReamur(double celcius) {
        return celcius * 4 / 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KonversiSuhu konversi = new KonversiSuhu();

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = konversi.celciusToFahrenheit(celcius);
        double reamur = konversi.celciusToReamur(celcius);

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Reamur: " + reamur);

        scanner.close();
    }
}
