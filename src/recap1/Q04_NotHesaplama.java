package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

       int vize1,vize2,finalnot;
        Scanner scan =new Scanner(System.in);
        System.out.print("1.vize notu:");
       vize1=scan.nextInt();
        System.out.print("2.vize notu");
         vize2=scan.nextInt();
        System.out.print("final notu");
       finalnot=scan.nextInt();

         double sonuc =  (vize1 + vize2)*0.3 +  finalnot*0.7;
        System.out.println("final notu :"+ finalnot);


    }
}
