package P12;

import java.util.Scanner;

public class Tugas_P12_29 {

    public static void main(String[] args) {
        Scanner sult29 = new Scanner(System.in);
        int responden = 10, pertanyaan = 6;
        int [][] hasilSurvey = new int [responden][pertanyaan];

        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Responden ke- "+(i+1));
            double totResponden = 0, rataRespondnen = 0;

            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.println("Pertanyaan ke- "+(j+1)+" Masukkan Rentang Nilai (1-5): ");
                hasilSurvey[i][j] = sult29.nextInt();
                totResponden += hasilSurvey[i][j];
            }
            rataRespondnen = rataRespondnen / pertanyaan;
            System.out.println("Nilai Rata-rata Responden "+(i+1)+" Yaitu: "+rataRespondnen);
        }
        for (int j = 0; j < pertanyaan; j++) {
            double totalPertanyaan = 0, rataPertanyaan = 0;

            for (int i = 0; i < responden; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            rataPertanyaan = totalPertanyaan / responden;
            System.out.println("Rata-rata Pertanyaan "+ (j+1)+ " Yaitu: "+rataPertanyaan);
        }
        double total = 0;
        double rataRata = 0;
        for (int i = 0; i < responden; i++) {
            for (int j = 0; j < pertanyaan; j++) {
                total += hasilSurvey[i][j];
            }
        }
        rataRata = total / (responden*pertanyaan);
        System.out.println("Rata-rata Keseluruhan Yaitu: "+rataRata);
        System.out.println();
    }
}