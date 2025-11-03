package P10;

import java.util.Scanner;

public class star29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        System.out.println("Masukkan nilai n = ");
        int n = sultan29.nextInt();

        for (int i=1; i<n; i++){
            System.out.print("*");
        }
        sultan29.close();
    }
}