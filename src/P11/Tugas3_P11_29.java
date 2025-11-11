package P11;

import java.util.Scanner;

public class Tugas3_P11_29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "ChocoLate Ice"};
        String[] arrSmenu = {"NasiGoreng", "Miegoreng", "RotiBakar", "KentangGoreng", "TehTarik", "Cappucino", "ChocoLateIce"}; 
        String key29;
        boolean ditemukan = false; 
        String NmaPlanggan29;
        int JmlNasiGoreng29, JmlMieGoreng29, JmlRotiBakar29, JmlKentangGoreng29, JmlTehTarik29, JmlCappucino29, JmlChocolateIce29, TotHrg29;
        int HrgNasiGoreng29 = 20000;
        int HrgMiegoreng29 = 20000;
        int HrgRotiBakar29 = 15000;
        int HrgKentangGoreng29 = 15000;
        int HrgTehTarik29 = 10000;
        int HrgCappucino29 = 10000;
        int HrgChocolateIce29 = 15000;

        System.out.print("Masukkan menu yang ingin dicari : ");
        key29 = sultan29.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu [i].equalsIgnoreCase(key29)) {
                System.out.println("Makanan "+key29+" tersedia");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Makanan tersedia di menu!");
        } 
        System.out.print("Masukkan nama pelanggan : ");
        NmaPlanggan29 = sultan29.nextLine();

        System.out.println("daftar menu :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("Item : ");
        System.out.print("Jumlah Nasi Goreng : ");
        JmlNasiGoreng29 = sultan29.nextInt();
        System.out.print("Jumlah Mie Goreng : ");
        JmlMieGoreng29 = sultan29.nextInt();
        System.out.print("Jumlah Roti Bakar : ");
        JmlRotiBakar29 = sultan29.nextInt();
        System.out.print("Jumlah Kentang Goreng : ");
        JmlKentangGoreng29 = sultan29.nextInt();
        System.out.print("Jumlah Teh Tarik : ");
        JmlTehTarik29 = sultan29.nextInt();
        System.out.print("Jumlah Cappucino : ");
        JmlCappucino29 = sultan29.nextInt();
        System.out.print("Jumlah ChocolateIce : ");
        JmlChocolateIce29 = sultan29.nextInt();
    
        TotHrg29 = (HrgRotiBakar29*JmlRotiBakar29) + (HrgCappucino29*JmlCappucino29) + (HrgChocolateIce29*JmlChocolateIce29) + (HrgKentangGoreng29*JmlKentangGoreng29) + (HrgMiegoreng29*JmlMieGoreng29) + (HrgNasiGoreng29*JmlNasiGoreng29) + (HrgTehTarik29*JmlTehTarik29);
        sultan29.nextLine();

        if (JmlNasiGoreng29 > 0) {
             System.out.println("Nasi goreng : " + JmlNasiGoreng29 + " x Rp " + 20000 + " = Rp " + (JmlNasiGoreng29 * 20000));
        }
        if (JmlMieGoreng29 > 0) {
             System.out.println("Mie goreng : " + JmlMieGoreng29 + " x Rp " + 20000 + " = Rp " + (JmlMieGoreng29 * 20000));
        }
        if (JmlRotiBakar29 > 0) {
             System.out.println("Roti Bakar : " + JmlRotiBakar29 + " x Rp " + 15000 + " = Rp " + (JmlRotiBakar29 * 15000));
        }
        if (JmlKentangGoreng29 > 0) {
             System.out.println("kentang Goreng : " + JmlKentangGoreng29 + " x Rp " + 15000 + " = Rp " + (JmlKentangGoreng29 * 15000));
        }
        if (JmlTehTarik29 > 0) {
             System.out.println("Teh Tarik : " + JmlTehTarik29 + " x Rp " + 10000 + " = Rp " + (JmlTehTarik29 * 10000));
        }
        if (JmlCappucino29 > 0) {
            System.out.println("Cappucino : " + JmlCappucino29 + " x Rp " + 10000 + " = Rp " + (JmlCappucino29 * 10000));
        }
        if (JmlChocolateIce29 > 0) {
            System.out.println("Chocolate Ice : " + JmlChocolateIce29 + " x Rp " + 15000 + " = Rp " + (JmlChocolateIce29 * 15000));
        }
        System.out.println("--------------------------------");
        System.out.println("Total yang harus dibayar: Rp " + TotHrg29);
        System.out.println("--------------------------------");

    
    
    
    
    }
}