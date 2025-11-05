import java.util.Scanner;

public class Tugas1_P10_29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilaiAkhir = sultan29.nextInt();
        int kuadrat29 = 0;

        for (int i = 1; i <= nilaiAkhir; i++) {
            int total29 = 0;
            String tampil29 = "";

            for (int j = 1; j <= i; j++) {
                kuadrat29 = j * j;
                total29 +=kuadrat29;

                if (j==1) {
                    tampil29 =  "" + kuadrat29;
                } else {
                    tampil29 = tampil29 + " + " + kuadrat29;
                }

            }
            System.out.println("n = " +i+", jumlah kuadrat = " +tampil29+ " = " +total29);
        }
    }
}