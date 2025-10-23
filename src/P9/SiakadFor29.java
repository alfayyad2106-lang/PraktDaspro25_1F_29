import java.util.Scanner;

public class SiakadFor29 {

    public static void main(String[] args) {
        Scanner sultan = new Scanner(System.in);
        double nilai29=0, tertinggi29 = 0, terendah29 = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            nilai29 = sultan.nextDouble();
            if (nilai29 > tertinggi29) {
                tertinggi29 = nilai29;
            } if (nilai29 < terendah29) {
                terendah29 = nilai29;
            }
        }
        System.out.println("Nilai Tertinggi: " +tertinggi29);
        System.out.println("Nilai Terendah: " +terendah29);
    }
}