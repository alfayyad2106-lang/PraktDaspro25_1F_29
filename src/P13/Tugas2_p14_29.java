package P13;

import java.util.Scanner;

public class Tugas2_p14_29 {

    static void isianArray29(int[] nilai29, Scanner sult29 ){
        System.out.println("\n=== Input Nilai Mahasiswa ===");
        for (int i = 0; i < nilai29.length; i++) {
            System.out.print("Nilai mahasiswa ke-"+(i+1)+": " );
            nilai29[i] = sult29.nextInt();
        }
    } 
    static void tampilArray29(int[] nilai29){
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai29.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+": "+nilai29[i]);
        }
    }
    static int htngTotal29 (int[] nilai29) {
        int total29 = 0;
        for (int n : nilai29) {
            total29+=n;
        }
        return total29;
    }
    public static void main(String[] args) {
        Scanner sult29 = new Scanner (System.in);
        System.out.println("Masukkan jumlah Mahasiswa (N): ");
        int N = sult29.nextInt();

        int[] nilaiMahasiswa29 = new int[N];

        isianArray29(nilaiMahasiswa29, sult29);
        tampilArray29(nilaiMahasiswa29);

        int totNilai29 = htngTotal29(nilaiMahasiswa29);

        System.out.println("\nTotal nilai seluruh Mahasiswa = "+totNilai29);
    }
}