
package Pertemuan3Latihan1;

public class MatematikaInheritance {
   
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika2 (karena Matematika2 mewarisi Matematika)
        Matematika2 matematika2 = new Matematika2();

        // Memanggil method dari kelas Matematika
        int hasilPertambahan = matematika2.pertambahan(20, 10);
        int hasilPengurangan = matematika2.pengurangan(10, 5);
        int hasilPerkalian = matematika2.perkalian(10, 3);
        int hasilPembagian = matematika2.pembagian(21, 2);

        // Memanggil method modulus dari kelas Matematika2
        int hasilModulus = matematika2.modulus(21, 2);

        // Menampilkan hasil operasi matematika
        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);
        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);
        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);
        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
        System.out.println("Modulus : 21 % 2 = " + hasilModulus);
    }
}
