package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int  sayi= scan.nextInt();

        int birlerbasamagi=0;
        int rakamlarToplami=0;

        birlerbasamagi=sayi %10 ;
        rakamlarToplami += birlerbasamagi;
        sayi/=10;

        birlerbasamagi=sayi %10;
        rakamlarToplami +=birlerbasamagi;

        sayi/=10;
        birlerbasamagi=sayi %10;
        rakamlarToplami += birlerbasamagi;

        sayi/=10;
        birlerbasamagi=sayi %10;
        rakamlarToplami += birlerbasamagi;
        System.out.println( rakamlarToplami);


    }
}
