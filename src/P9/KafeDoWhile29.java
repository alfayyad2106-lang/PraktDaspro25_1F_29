import java.util.Scanner;

public class KafeDoWhile29 {

    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc29.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi Dibatalkan.");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc29.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc29.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc29.nextInt();
            int totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " +totalHarga);
            sc29.nextLine();

        } while (true);

        System.out.println("Semua transaksi telah selesai.");
    }
}