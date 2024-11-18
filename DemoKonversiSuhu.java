
package Pertemuan3PBO;

import Pertemuan3Latihan2.KonversiSuhu2;


public class DemoKonversiSuhu {
    public static void main(String[] args) {
        // Membuat objek dari kelas KonversiSuhu2
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Nilai suhu dalam Celcius dan Fahrenheit
        double celcius = 25.0;
        double fahrenheit = 77.0;

        // Melakukan konversi suhu
        double hasilCelciusToFahrenheit = konversi.celciusToFahrenheit(celcius);
        double hasilCelciusToReamur = konversi.celciusToReamur(celcius);
        double hasilFahrenheitToReamur = konversi.fahrenheitToReamur(fahrenheit);

        // Menampilkan hasil konversi suhu
        System.out.println("25.0 Celcius to Fahrenheit = " + hasilCelciusToFahrenheit);
        System.out.println("25.0 Celcius to Reamur = " + hasilCelciusToReamur);
        System.out.println("77.0 Fahrenheit to Reamur = " + hasilFahrenheitToReamur);
    }
}
