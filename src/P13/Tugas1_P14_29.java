package P13;

import java.util.Scanner;

public class Tugas1_P14_29 {

    static double hitungVolume (double sisi29) {
        return sisi29 * sisi29 *sisi29;
    }
    static double htngLuasPermukaan (double sisi29){
        return 6*sisi29*sisi29;
    }
    public static void main(String[] args) {
        Scanner sult29 = new Scanner(System.in);

        System.out.println("=== Program Perhitungan Kubus ===");
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi29 = sult29.nextDouble();

        double volume29 = hitungVolume(sisi29);
        double luasPermukaan29 = htngLuasPermukaan(sisi29);

        System.out.println("\n=== Hasil Perhitungan ===");
        System.out.println("Volume Kubus         : "+volume29);
        System.out.println("Luas Permukaan Kubus : "+luasPermukaan29);
    }
}