import java.util.Scanner;

public class Tugas1_P9_29 {

    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int hrgTiket29 = 50000, jmlTiket29, totTiket = 0;
        double diskon, hrgDasar, totBayar, totPendapatan = 0; 
        String lanjut;
        // String namaPelanggan;

        // do {
        //     System.out.print("Masukkan tanggal (ketik 'batal' untuk keluar): ");
        //     namaPelanggan = sc29.nextLine();
        //     if (namaPelanggan.equalsIgnoreCase("batal")) {
        //         System.out.println("Pembelian Tiket Dibatalkan.");
        //         break;
        //     }


        //     System.out.print("Masukkan Jumlah Penjualan Tiket: ");
        //     jmlTiket = sc29.nextInt();
        //     int totHarga = jmlTiket * tiket29;
        //     System.out.println("Total Penjualan Tiket: " +totHarga);


        
        // } while (true);
        // System.out.println("Semua transaksi telah selesai. ");

        while (true) {
            System.out.println("Masukkan Jumlah Tiket: ");
            jmlTiket29 = sc29.nextInt();

             if (jmlTiket29 < 0) {
            System.out.println("Input tidak valid! Jumlah Tiket tidak boleh negatif.");
            continue;
             
            }

            hrgDasar = jmlTiket29*hrgTiket29;

            if (jmlTiket29 > 10) {
                diskon = 0.15;
            } else if (jmlTiket29 > 4) {
                diskon = 0.10;
            }else {
                diskon = 0;
            }

            totBayar = hrgDasar - (hrgDasar * diskon);

            totTiket += jmlTiket29;
            totPendapatan += totBayar; 

            System.out.println("Harga Dasar: Rp" + hrgTiket29);
            System.out.println("Diskon : " + diskon*100 + "%" );
            System.out.println("Total Bayar: " + "\n");
            System.out.println("Apakah aada Pelanggan lain? (Iya/Tidak): ");
            lanjut = sc29.next();
            if (lanjut.equalsIgnoreCase("Tidak")) {
                break;
            }
            System.out.println();
            System.out.println("=================================");
            System.out.println("Total Tiket yang Terjual" +totTiket);
            System.out.println("Total Pendapatan Hari: RP " +totPendapatan);
            System.out.println("=================================");

            sc29.close();
        }
       
    }
}