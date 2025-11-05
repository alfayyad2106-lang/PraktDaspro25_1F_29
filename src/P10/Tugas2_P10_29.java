import java.util.Scanner;

public class Tugas2_P10_29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        System.out.print("Masukkan nilai n:");
        int n = sultan29.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > 1 && i < n && j > 1 && j < n) {
                    System.out.print("  ");
                } else {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}