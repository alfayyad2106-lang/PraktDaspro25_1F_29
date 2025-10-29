
import java.util.Scanner;

public class Tugas2P9_29 {
    public static void main(String[] args) {
        Scanner Su29 = new Scanner(System.in);

        int durasi29, totharga29, keluar29 = 0;
        int parkirmobil29 = 3000;
        int parkirmotor29 = 2000;
        String jeniskendaraan29;

        do {
            System.out.println("Masukkan jenis kendaraan (mobil/motor):");
            jeniskendaraan29 = Su29.nextLine();

            System.out.println("Masukkan durasi (jam):");
            durasi29 = Su29.nextInt();
            Su29.nextLine(); // membersihkan newline

            if (jeniskendaraan29.equalsIgnoreCase("mobil")) {
                totharga29 = (durasi29 > 5) ? 12500 + parkirmobil29 : durasi29 * parkirmobil29;
                System.out.println("Total harga: " + totharga29);
            } else if (jeniskendaraan29.equalsIgnoreCase("motor")) {
                totharga29 = (durasi29 > 5) ? 12500 + parkirmotor29 : durasi29 * parkirmotor29;
                System.out.println("Total harga: " + totharga29);
            } else {
                System.out.println("Jenis kendaraan tidak dikenali.");
            }

            System.out.print("Apakah anda ingin keluar? (ya/tidak): ");
            String jawaban = Su29.nextLine();
            if (jawaban.equalsIgnoreCase("ya")) {
                keluar29 = 1;
            }

        } while (keluar29 == 0);
        Su29.close();
    }
}


