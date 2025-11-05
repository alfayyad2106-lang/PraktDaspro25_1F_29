import java.util.Scanner;

public class NilaiKelompok29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        
        int i=1;
        while (i<=6) {
            System.out.println("Kelompok " +i);
            double totalNilai = 0;  

            for(int j=1;j<=5;j++) {
            System.out.print("Nilai dari Kelompok Penilai " +j+ ": ");
            double nilai = sultan29.nextDouble();
            totalNilai +=nilai;
        }
        double rataNilai = totalNilai /5;
        System.out.println("Kelompok " +i+ ": " + "nilai rata-rata = " +rataNilai);
        i++; 
        }

        

    }
}