package P12;

import java.util.Scanner;

public class SIAKAD29 {
    public static void main(String[] args) {
        Scanner sult29 = new Scanner (System.in);

        int[][] nilai29 = new int[4][3];

        for (int i = 0; i < nilai29.length; i++) {
            System.out.println("Input Nilai Mahasiswa Ke- "+(i+1));
                double totPerMhs = 0; 
            for (int j = 0; j < nilai29[i].length; j++) {
                System.out.print("Nilai Mata Kuliah "+(j+1)+": ");
                nilai29[i][j] = sult29.nextInt();
                totPerMhs += nilai29[i][j];
            }
            System.out.println("Nilai Rata-Rata: "+totPerMhs/3);
        }

        System.out.println("\n==================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah: ");

        for (int j = 0; j < 3; j++) {
            double totPerMatkul = 0;
            for (int i = 0; i < 3; i++) {
                totPerMatkul +=nilai29[i][j];
            }
            System.out.println("Mata Kuliah: " +(j+1)+": "+totPerMatkul/4);
        }
    }
}