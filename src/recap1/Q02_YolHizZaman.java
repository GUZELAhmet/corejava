package recap1;

import java.util.Scanner;

public class Q02_YolHizZaman {
    /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("mesafeyi giriniz: ");
        int mesafe=scan.nextInt();

        System.out.println("hızı giriniz");
        int hiz=scan.nextInt();
       double sure=(double)mesafe/hiz;
        System.out.println("sure "+ sure  + "saattir");



    }
}
