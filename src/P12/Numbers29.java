package P12;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers29 {

    public static void main(String[] args) {
        Scanner sult29 = new Scanner(System.in);

        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];


        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        System.out.println();
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang Baris ke-"+ (i+1)+ ": "+ myNumbers[i].length);
        }
    }
}