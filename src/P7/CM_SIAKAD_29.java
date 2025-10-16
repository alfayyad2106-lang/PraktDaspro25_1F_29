import java.util.Scanner;

public class caseMethod29 {

    public static void main(String[] args) { 
        Scanner as = new Scanner(System.in);
        String nH_PS29, nH_Daspro29, nH_BIG29;
        double nS_PS29, nS_Daspro29, nS_BIG29;

        
        System.out.println("INPUT DATA MAHASISWA");
        System.out.println("Nama: ");
        String nama29 = as.nextLine();
        System.out.println("NIM:");
        String NIM29 = as.nextLine();

        System.out.println(" ===Data mahasiswa===");
        System.out.println("Nama: " + nama29);
        System.out.println("NIM: " +NIM29);
        System.out.println("Masukkan nilai angka: ");
        System.out.println("Pancasila: ");
        double nA_PS29 = as.nextDouble();
        System.out.println("Dasar Pemrograman: ");
        double nA_Daspro29 = as.nextDouble();
        System.out.println("Bahasa inggris: ");
        double nA_BIG29 = as.nextDouble();
        
        if (nA_PS29 < 0 || nA_PS29 > 100||
        nA_Daspro29 < 0 || nA_Daspro29 > 100 ||
        nA_BIG29 < 0 || nA_BIG29 > 100) {
        System.out.println("[ERROR]Nilai tidak valid, Nilai harus berada di antara 1-100");
        }

        if (nA_PS29 <= 39) {
            nH_PS29 = "E";nS_PS29 = 0.0;
        }else if (nA_PS29 <= 50) {
            nH_PS29 = "D";nS_PS29 = 1.0;
        }else if (nA_PS29 <= 60) {
            nH_PS29 = "C";nS_PS29 = 2.0;
        }else if (nA_PS29 <= 65) {
            nH_PS29 = "C+";nS_PS29 = 2.5;
        }else if (nA_PS29 <= 73) {
            nH_PS29 = "B";nS_PS29 = 3.0;
        }else if (nA_PS29 <= 80) {
            nH_PS29 = "B+";nS_PS29 =3.5;
        } else { 
            nH_PS29 = "A";nS_PS29 = 4.0;
        }  

        if (nA_Daspro29 < 39) {
            nH_Daspro29 = "E";nS_Daspro29 = 0.0;
        }else if (nA_Daspro29 <= 50) {
            nH_Daspro29 = "D";nS_Daspro29 = 1.0;
        }else if (nA_Daspro29 <= 60) {
            nH_Daspro29 = "C";nS_Daspro29 = 2.0;
        }else if (nA_Daspro29 <= 65) {
            nH_Daspro29 = "C+";nS_Daspro29 = 2.5;
        }else if (nA_Daspro29 <= 73) {
            nH_Daspro29 = "B";nS_Daspro29 = 3.0;
        }else if (nA_Daspro29 <= 80) {
            nH_Daspro29 = "B+";nS_Daspro29 =3.5;
        } else { 
            nH_Daspro29 = "A";nS_Daspro29 = 4.0;
        }  

        if (nA_BIG29 <= 39) {
            nH_BIG29 = "E";nS_BIG29 = 0.0;
        }else if (nA_BIG29 <= 50) {
            nH_BIG29 = "D";nS_BIG29 = 1.0;
        }else if (nA_BIG29 <= 60) {
            nH_BIG29 = "C";nS_BIG29 = 2.0;
        }else if (nA_BIG29 <= 65) {
            nH_BIG29 = "C+";nS_BIG29 = 2.5;
        }else if (nA_BIG29 <= 73) {
            nH_BIG29 = "B";nS_BIG29 = 3.0;
        }else if (nA_BIG29 <= 80) {
            nH_BIG29 = "B+";nS_BIG29 =3.5;
        } else { 
            nH_BIG29 = "A";nS_BIG29 = 4.0;
        }  
       
    double SKSPancasila= 2.0;
    double SKSDaspro = 3.0;
    double SKSBshInggris = 2.0;

    double totBobot = (nS_PS29*SKSPancasila) + (nS_Daspro29*SKSDaspro) + (nS_BIG29*SKSBshInggris);
    double totSKS = SKSPancasila + SKSDaspro + SKSBshInggris;
    double iP = totBobot / totSKS;

    String status ="";
    if (iP >= 2.0 || !nH_PS29.equals("D")
        || !nH_Daspro29.equals("E") || !nH_BIG29.equals("E")) {
        status = "Tidak Lulus";
    }else{
        
        status = "Lulus Semester";
    }

    System.out.println("==============================");
    System.out.println("HASIL KONVERSI NILAI MAHASISWA");
    System.out.println("==============================");
    System.out.println("Nama: " +nama29);
    System.out.println("NIM: " +NIM29);
    System.out.println("Mata Kuliah                 SKS     Nilai       Huruf       Setara");
    System.out.println("Pancasila                   2"+"        "  +nA_PS29+"         "+nH_PS29+"         "+nS_PS29);
    System.out.println("Dasar Pemrograman           3"+"        "  +nA_Daspro29+"         " +nH_Daspro29+"         "+nS_Daspro29);
    System.out.println("Bahasa Inggris              2"+"        "  +nA_BIG29+"         " +nH_BIG29+"         "+nS_BIG29);
    System.out.println("Total SKS: " +totSKS);
    System.out.println("Total bobot:" +totBobot);
    System.out.println("Indeks prestasi: " +iP);
    System.out.println("Status semester: " +status);
    
     
    }
}