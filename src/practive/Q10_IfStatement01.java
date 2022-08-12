package practive;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan = new Scanner(System.in);


        System.out.println("lutfen Y/n ikilisinden birini giriniz");
     char  ch=scan.next().charAt(0);

     if (ch== 'Y'|| ch=='y'  ) {
         System.out.println("yes");
     } else if(  ch== 'N'|| ch=='n'   ){
         System.out.println("no");}
         else {
             System.out.println("geçersiz bir harf girdiniz");
         }
     }


    }

