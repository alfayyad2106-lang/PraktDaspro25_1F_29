import java.util.Scanner;

public class SiakadWhile29 {
public static void main(String[] args) {
    Scanner sc29 = new Scanner(System.in);
    int nilai, jml, i=0;

    System.out.println("Masukkan jumlah siswa: ");
    jml = sc29.nextInt();

    while (i < jml) {
        System.out.println("Masukkan jumlah mahasiswa ke-" + (i + 1) + ": ");
        nilai = sc29.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("nilai tidak valid. masukkan nilai yang valid!");
            continue;
        }   
        
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "Adalah A");
            System.out.println("Bagus, pertahankan nilainya");
        } else if (nilai > 73 && nilai <= 80) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "Adalah B+");
        } else if (nilai > 65 && nilai <= 73) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "Adalah B");
        } else if (nilai > 60 && nilai <= 65) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "Adalah C+");
        } else if (nilai > 50 && nilai <= 60) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "Adalah C");
        } else {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + "Adalah E");
        }

        i++;
    }
}
    
}