import java.util.Scanner;

public class Tugas3_P1029 {
    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sultan29.nextInt();
        System.out.println("== Input Penjualan Per Cabang ==\n");
        int planggan29, totPlanggan29 = 0, totTerjual29 = 0;
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("--- Cabang " + i + "---");
            System.out.print("Jumlah pelanggan: ");
            planggan29 = sultan29.nextInt();
            totPlanggan29 += planggan29;
            int itemTerjual = 0;
            for (int j = 1; j <= planggan29; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int itemSatuPembeli = sultan29.nextInt();
                itemTerjual += itemSatuPembeli;
                totTerjual29 += itemSatuPembeli;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + planggan29 + " orang");
            System.out.println("- Item terjual :" + itemTerjual + "\n");
        }
        System.out.println("Total seluruh Cabang: ");
        System.out.println("Pelanggan: " + totPlanggan29 + "orang" );
        System.out.println("Item terjual: " + totTerjual29 + " item");

        sultan29.close();
    }
}