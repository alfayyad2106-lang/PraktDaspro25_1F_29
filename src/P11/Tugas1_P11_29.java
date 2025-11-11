package P11;

import java.util.Scanner;

public class Tugas1_P11_29 {

    public static void main(String[] args) {
    Scanner sultan29 = new Scanner(System.in);
    int jmlMhs29, nilaiTertinggi29 = 0, nilaiTerendah29 = 0;
    double rata2, total = 0;

    System.out.print("Masukkan Jumlah Mahasiswa : ");
    jmlMhs29 = sultan29.nextInt();
    int nilaiMhs29[] = new int [jmlMhs29];

    for (int i = 0; i < jmlMhs29; i++) {
        System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs29[i] = sultan29.nextInt();

    }
    for (int i = 0; i < nilaiMhs29.length; i++) {
        total += nilaiMhs29[i];
    }

    rata2 = total/nilaiMhs29.length;
    System.out.println("Rata-rata Nilai = "+rata2);

    for (int i = 0; i < nilaiMhs29.length; i++) {
        total +=nilaiMhs29[i];
        if (nilaiMhs29[i] > nilaiTertinggi29) {
            nilaiTertinggi29=nilaiMhs29[i];
        } else {
            if (nilaiMhs29[i] > nilaiTerendah29) {
                nilaiTerendah29 = nilaiMhs29[i];
            }
        }
    }
    System.out.println("Nilai Tertinggi adalah "+nilaiTertinggi29);
    System.out.println("Nilai Terendah adalah "+nilaiTerendah29);
    
    }
}