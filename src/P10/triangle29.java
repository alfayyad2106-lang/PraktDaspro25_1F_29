import java.util.Scanner;

public class triangle29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int n = sultan29.nextInt();
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}