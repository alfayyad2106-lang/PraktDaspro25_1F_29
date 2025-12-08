package CM2;

import java.util.Scanner;

public class CM2_P16_29 {
//mohon maaf Bu, untuk pengumpulan nya telat dikarenakan jaringan di sini error dan juga lms nya tadi sempat bermasalah
// sekali lagi mohon maaf Bu
    static Scanner sult29 = new Scanner(System.in);

    static String[] mataKuliah29 = {
            "Pancasila",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Bahasa Inggris",
            "Fisika",
            "Matematika Dasar",
            "Konsep Teknologi Informasi",
            "Keselamatan dan Kesehatan Kerja",
            "Critical thinking dan problem solving"
    };

    static int[] sks29 = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };
    static String[] namaMhs29;
    static String[] nim29;
    static double[][] nilai29;

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs29 = sult29.nextInt();
        sult29.nextLine();

        namaMhs29 = new String[jmlMhs29];
        nim29 = new String[jmlMhs29];
        nilai29 = new double[jmlMhs29][mataKuliah29.length];

        for (int i = 0; i < jmlMhs29; i++) {
            namaMhs29[i] = "-";
            nim29[i] = "-";
        }

        int menu29;

        do {
            menu29();
            menu29 = sult29.nextInt();

            switch (menu29) {
                case 1 -> menuSatu29();
                case 2 -> menuDua29();
                case 3 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Menu tidak valid!\n");
            }

        } while (menu29 != 3);
    }

    static String knvrsHuruf29(double nMatkul29) {
        if (nMatkul29 >= 80)
            return "A";
        else if (nMatkul29 >= 70)
            return "B+";
        else if (nMatkul29 >= 65)
            return "B";
        else if (nMatkul29 >= 60)
            return "C+";
        else if (nMatkul29 >= 55)
            return "C";
        else if (nMatkul29 >= 50)
            return "D";
        else
            return "E";
    }

    static double knvrsBobot29(String hurufNilai29) {
        return switch (hurufNilai29) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }

    static void menu29() {
        System.out.println("=========================================");
        System.out.println("       SISTEM SIAKAD SEDERHANA (MENU)");
        System.out.println("=========================================");
        System.out.println("1. Input nilai mata kuliah");
        System.out.println("2. Lihat KHS (konversi & IP + status)");
        System.out.println("3. Keluar");
        System.out.println("=========================================");
        System.out.print("Pilih menu (1-3): ");
    }

    static void menuSatu29() {

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < namaMhs29.length; i++) {
            System.out.println((i + 1) + ". " + namaMhs29[i] + " / " + nim29[i]);
        }

        System.out.print("Pilih nomor mahasiswa (1-" + namaMhs29.length + "): ");
        int j = sult29.nextInt();
        sult29.nextLine();
        j--;

        System.out.println("=== INPUT NILAI MAHASISWA ===");

        System.out.print("Nama : ");
        namaMhs29[j] = sult29.nextLine();

        System.out.print("NIM  : ");
        nim29[j] = sult29.nextLine();

        System.out.println("\nMasukkan nilai (0 - 100) untuk mata kuliah berikut:");

        for (int i = 0; i < mataKuliah29.length; i++) {
            System.out.print((i + 1) + ". " + mataKuliah29[i] + ": ");
            nilai29[j][i] = galih29.nextDouble();

            if (nilai29[j][i] < 0 || nilai29[j][i] > 100) {
                System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus antara 0 - 100.");
                i--;
            }
        }

        System.out.println("\n[OK] Semua nilai berhasil dimasukkan.\n");
    }

    static void menuDua29() {

        System.out.println("\nDaftar Mahasiswa:");
        for (int i = 0; i < namaMhs29.length; i++) {
            System.out.println((i + 1) + ". " + namaMhs29[i] + " / " + nim29[i]);
        }

        System.out.print("Pilih nomor mahasiswa (1-" + namaMhs29.length + "): ");
        int j = sult29.nextInt();
        j--;

        System.out.println("\n=========================================");
        System.out.println("    HASIL KONVERSI NILAI MAHASISWA");
        System.out.println("=========================================");
        System.out.println("Nama : " + namaMhs29[j]);
        System.out.println("NIM  : " + nim29[j]);
        System.out.println("-----------------------------------------");
        System.out.printf("%-3s %-35s %-3s %-5s %-7s %-5s\n",
                "No", "Mata Kuliah", "SKS", "Nilai", "Huruf", "Setara");
        System.out.println("-----------------------------------------");

        double totalSKS29 = 0, totalBobot29 = 0;
        boolean nilaiE29 = false;

        for (int i = 0; i < mataKuliah29.length; i++) {

            String huruf29 = knvrsHuruf29(nilai29[j][i]);
            double bobot29 = knvrsBobot29(huruf29);

            if (huruf29.equals("E"))
                nilaiE29 = true;

            System.out.printf("%-3d %-35s %-3d %-5.0f %-7s %-5.1f\n",
                    (i + 1), mataKuliah29[i], sks29[i], nilai29[j][i], huruf29, bobot29);

            totalSKS29 += sks29[i];
            totalBobot29 += bobot29 * sks29[i];
        }

        double ip29 = totalBobot29 / totalSKS29;

        System.out.println("-----------------------------------------");
        System.out.println("Total SKS: " + (int) totalSKS29);
        System.out.printf("Total Bobot: %.1f\n", totalBobot29);
        System.out.printf("Indeks Prestasi (IP): %.2f\n", ip29);

        String statKelulusan29;

        if (nilaiE29) {
            statKelulusan29 = "TIDAK LULUS (Terdapat Nilai E)";
        } else if (nilai29[j][0] < 55) {
            statKelulusan29 = "TIDAK LULUS (Nilai Pancasila kurang dari C)";
        } else if (ip29 < 2.0) {
            statKelulusan29 = "TIDAK LULUS (IP < 2.00)";
        } else {
            statKelulusan29 = "LULUS";
        }

        System.out.println("Status Semester : " + statKelulusan29);
        System.out.println("=========================================\n");
    }
}