package kosulluIfadeler;
import java.util.Scanner;

public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklikDegeri;
        Scanner input = new Scanner (System.in);
        System.out.print("Sıcaklık Değeri: ");
        sicaklikDegeri = input.nextInt();
        
        if (sicaklikDegeri < 5) {
            System.out.println("Kayak yapabilirsin.");
        }else if (sicaklikDegeri <= 10 ) {
            System.out.println("Sinemaya gidebilirsin.");
        }else if(sicaklikDegeri <= 15) {
            System.out.println("Sinemaya ya da piknik, tercih senin.");
        }else if(sicaklikDegeri < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}
