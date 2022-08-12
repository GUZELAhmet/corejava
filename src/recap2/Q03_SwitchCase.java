package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("3 haneli bir sayı giriniz");
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = sayi / 100;

        if(sayi>99 && sayi<1000) {
            switch (yuzler) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("Yüz\t");
                    break;
                case 2:
                    System.out.println("ikiyüz\t");
                    break;
                case 3:
                    System.out.println("üçyüz\t");
                    break;
                case 4:
                    System.out.println("dörtyüz\t");
                    break;
                case 5:
                    System.out.println("beşyüz\t");
                    break;
                case 6:
                    System.out.println("altıyüz\t");
                    break;
                case 7:
                    System.out.println("yediyüz\t");
                    break;
                case 8:
                    System.out.println("sekizyüz\t");
                    break;
                case 9:
                    System.out.println("dokuzyüz\t");
                    break;
            }
            switch (onlar) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on\t");
                    break;
                case 2:
                    System.out.println("iyirmi\t");
                    break;
                case 3:
                    System.out.println("otuz\t");
                    break;
                case 4:
                    System.out.println("kırk\t");
                    break;
                case 5:
                    System.out.println("elli\t");
                    break;
                case 6:
                    System.out.println("altmış\t");
                    break;
                case 7:
                    System.out.println("yetmiş\t");
                    break;
                case 8:
                    System.out.println("seksen\t");
                    break;
                case 9:
                    System.out.println("doksan\t");
                    break;
            }

            switch (birler) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        } else System.out.println("üç basamaklı sayı giriniz");
    }
}
