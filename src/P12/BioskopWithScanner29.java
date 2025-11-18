package P12;

import java.util.Scanner;

public class BioskopWithScanner29 {

    public static void main(String[] args) {
       Scanner sult29 = new Scanner(System.in);
       
       String[][] penonton29 = new String [4][2];

       while (true) {
        System.out.print("Masukkan Nama: ");
        String nama = sult29.nextLine();
        System.out.print("Masukkan Baris: ");
        int baris =  sult29.nextInt();
        System.out.print("Masukkan Kolom: ");
        int kolom = sult29.nextInt();
        sult29.nextLine(); 

        penonton29[baris-1][kolom-1]= nama; 
        System.out.print("Input Penonton Lainnya? (y/n): ");
        String next = sult29.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
        
       }
    }
}