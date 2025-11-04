import java.util.Scanner;

public class square29 {

    public static void main(String[] args) {
        Scanner sultan29 = new Scanner(System.in);
        System.out.println("Masukkan nilai n = ");
        int n = sultan29.nextInt();

        for (int iOuter=1; iOuter<=n;iOuter++){
             for (int i=1; i<=n; i+=2){
                System.out.print("*");
            }
            System.out.println();
        }    
       
    }
}