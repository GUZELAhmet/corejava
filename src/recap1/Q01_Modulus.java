package recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        System.out.println("lütfen 5 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int s1=sayi/1000;
        int s11=s1/10+s1%10;
        int s2=sayi % 100;
        int s22=s2/10+s2%10;
        System.out.println("sonuç: "+ (s11+s22));

    }

}
