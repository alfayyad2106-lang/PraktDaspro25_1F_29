package P11;

public class SearchNilai29 {

    public static void main(String[] args) {
     int[] arrNilai29 = {80, 85, 78, 96, 90, 82, 86 };
     int key = 90;
     int hasil29 = 0;
     for (int i = 0; i < arrNilai29.length; i++) {
        if (key == arrNilai29[i]) {
            hasil29 = i;
            break;
        }
     }   
     System.out.println();
     System.out.println("Nilai "+key+" Ketemu di Indeks ke-" +hasil29);
     System.out.println();
    }
}