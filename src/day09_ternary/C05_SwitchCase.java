package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {

    public static void main(String[] args) {
        /*
         kullanicidan gun numarasini alip
         1 ise pazartesi,
         ...
         7 ise pazar yazdiralim
         */

        Scanner scan= new Scanner(System.in);
        System.out.println( "lütfen bir harf giriniz");
        int gunno = scan.nextInt();

        switch(gunno) {
            case 1 :
                System.out.println("pazartesi"); break;
            case 2 :
                System.out.println("salı");break;
            case 3 :
                System.out.println("çarşamba");break;
            case 4 :
                System.out.println("perşembe");break;
            case 5 :
                System.out.println("cuma");break;
            case 6 :
                System.out.println("cumartesi");break;
            case 7 :
                System.out.println("pazar");

        }
    }
}
