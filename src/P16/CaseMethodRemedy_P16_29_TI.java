import java.util.Scanner;

public class CaseMethodRemedy_P16_29_TI {

    static Scanner sult29 = new Scanner(System.in);

    static String[] namaPegawai29;
    static String[] NIK29;
    static double[] gajiPokok29;
    static String[] statusPernikahan29;
    static int[] jmlAnak29;
    static int[] lamaKerja29;

    static int jumlahPegawai29 = 0;
    static int banyakData29 = 0;

    static int inputIntValid29() {
        while (true) {
            if (sult29.hasNextInt()) {
                int nilai = sult29.nextInt();
                sult29.nextLine();
                return nilai;
            } else {
                System.out.print("Masukkan angka yang benar: ");
                sult29.nextLine();
            }
        }
    }

    static void menu29() {
        System.out.println("\n=================================");
        System.out.println("    SISTEM PENGGAJIAN PEGAWAI      ");
        System.out.println("=================================");
        System.out.println("1. Input Data Pegawai");
        System.out.println("2. Tampilkan Semua Data");
        System.out.println("3. Slip Gaji Pegawai");
        System.out.println("4. Keluar");
        System.out.println("\n=================================");
        System.out.print("Pilih menu (1-4): ");
    }

    static void menuInputPegawai29() {

        if (banyakData29 >= jumlahPegawai29) {
            System.out.println("Data pegawai sudah penuh!");
            return;
        }

        System.out.println("\n=== INPUT DATA PEGAWAI ===");
        int i = banyakData29;

        System.out.print("Nama Pegawai : ");
        namaPegawai29[i] = sult29.nextLine();

        System.out.print("NIK : ");
        NIK29[i] = sult29.nextLine();

        System.out.print("Gaji Pokok : ");
        gajiPokok29[i] = sult29.nextDouble();
        sult29.nextLine();

        System.out.print("Status Pernikahan (y/n) : ");
        statusPernikahan29[i] = sult29.nextLine();

        System.out.print("Jumlah Anak : ");
        jmlAnak29[i] = inputIntValid29();

        System.out.print("Lama Kerja (tahun) : ");
        lamaKerja29[i] = inputIntValid29();

        banyakData29++;
        System.out.println("Data berhasil ditambahkan!\n");
    }

    static void menuTampilPegawai29() {

        System.out.println("\n=== DATA PEGAWAI ===");

        if (banyakData29 == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < banyakData29; i++) {
            System.out.println((i + 1) + ". " + namaPegawai29[i] +
                    "\n  NIK: " + NIK29[i] +
                    "\n  Gaji Pokok: " + gajiPokok29[i]);
        }
    }


    static void slipGaji29() {

        System.out.println("\n=== SLIP GAJI PEGAWAI ===");

        if (banyakData29 == 0) {
            System.out.println("Belum ada data.");
            return;
        }

        for (int i = 0; i < banyakData29; i++) {

            double total29 = gajiPokok29[i];

            
            if (statusPernikahan29[i].equalsIgnoreCase("y")) {
                total29 += (gajiPokok29[i] * 0.1);
            }

            if (jmlAnak29[i]<4 && jmlAnak29[i]>0) {
                total29 += jmlAnak29[i] * (0.02*gajiPokok29[i]);
            } 
            
            if (lamaKerja29[i]>=10) {
                total29+=lamaKerja29[i] * (0.1*gajiPokok29[i]);
            }

            double pajak29 = 0.05*total29 ;
            double gajiBersih29 = total29 - pajak29;
            System.out.println("\nPegawai: " + namaPegawai29[i]);
            System.out.println("Gaji Kotor (Gross): "+ total29);
            System.out.println("Pajak: " + pajak29);
            System.out.println("Total Gaji Bersih: " + gajiBersih29);
        }
    }


    public static void main(String[] args) {

        System.out.print("Masukkan jumlah pegawai: ");
        jumlahPegawai29 = inputIntValid29();

        namaPegawai29 = new String[jumlahPegawai29];
        NIK29 = new String[jumlahPegawai29];
        gajiPokok29 = new double[jumlahPegawai29];
        statusPernikahan29 = new String[jumlahPegawai29];
        jmlAnak29 = new int[jumlahPegawai29];
        lamaKerja29 = new int[jumlahPegawai29];

        for (int i = 0; i < jumlahPegawai29; i++) {
            namaPegawai29[i] = "-";
            NIK29[i] = "-";
        }

        int menu;

        do {
            menu29();     
            menu = inputIntValid29();

            switch (menu) {
                case 1 -> menuInputPegawai29();
                case 2 -> menuTampilPegawai29();
                case 3 -> slipGaji29();
                case 4 -> System.out.println("Keluar program...");
                default -> System.out.println("Menu tidak terdaftar!\n");
            }

        } while (menu != 4);
    }
}