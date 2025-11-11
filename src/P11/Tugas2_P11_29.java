package P11;

import java.util.Scanner;

public class Tugas2_P11_29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);

        String[] menu = {"Kopi", "Teh", "Kentang Goreng","Roti", "Nasi Goreng"};
        String namaplanggan29;
        int jmlKopi29, jmlTeh29, jmlKentangGoreng29, jmlRoti29, jmlNasiGoreng29, TotHrg29;
        int HrgKopi29 = 15000;
        int HrgTeh29 = 5000;
        int HrgKentangGoreng29 = 15000;
        int HrgRoti29 = 5000;
        int HrgNasiGoreng29 = 20000;

        System.out.print("Masukkan nama pelanggan : ");
        namaplanggan29 = sultan29.nextLine();

        System.out.println("daftar menu :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("item ");
        System.out.print("Jumlah Kopi : ");
        jmlKopi29 = sultan29.nextInt();
        System.out.print("jumlah Teh : ");
        jmlTeh29 = sultan29.nextInt();
        System.out.print("Jumlah Kentang Goreng : ");
        jmlKentangGoreng29 = sultan29.nextInt();
        System.out.print("Jumlah Roti : ");
        jmlRoti29 = sultan29.nextInt();
        System.out.print("Jumlah Nasi Goreng : ");
        jmlNasiGoreng29 = sultan29.nextInt();

        TotHrg29 = (jmlKopi29 * HrgKopi29) + (jmlTeh29 * HrgTeh29) + (jmlKentangGoreng29 * HrgKentangGoreng29) + (jmlRoti29 * HrgRoti29) + (jmlNasiGoreng29 * HrgNasiGoreng29);
        sultan29.nextLine();
        
        System.out.println("-------- Nota Pembelian --------");
        System.out.println("Nama Pelanggan : "+namaplanggan29);
        System.out.println("Item: ");

        if (jmlKopi29 > 0) {
             System.out.println("Kopi : " + jmlKopi29 + " x Rp " + 15000 + " = Rp " + (jmlKopi29 * 15000));
        }
        if (jmlTeh29 > 0) {
             System.out.println("Teh : " + jmlTeh29 + " x Rp " + 5000 + " = Rp " + (jmlTeh29 * 5000));
        }
        if (jmlKentangGoreng29 > 0) {
             System.out.println("Kentang Goreng : " + jmlKentangGoreng29 + " x Rp " + 15000 + " = Rp " + (jmlKentangGoreng29 * 15000));
        }
        if (jmlRoti29 > 0) {
             System.out.println("Roti : " + jmlRoti29 + " x Rp " + 5000 + " = Rp " + (jmlRoti29 * 5000));
        }
        if (jmlNasiGoreng29 > 0) {
             System.out.println("Nasi Goreng : " + jmlNasiGoreng29 + " x Rp " + 20000 + " = Rp " + (jmlNasiGoreng29 * 20000));

        System.out.println("--------------------------------");
        System.out.println("Total yang harus dibayar: Rp " + TotHrg29);
        System.out.println("--------------------------------");
        }
    }
}