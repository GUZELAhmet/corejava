package day39_Expection;

import java.util.Scanner;

public class C05_illegalArgumentException {
    public static void main(String[] args) {
        // soru Kullanıcıdan yaşını girmesini isteyin
        //kodunuzda kullanıcı sıfırdan kucuk bir sayı girerse
        // Exception verecek şekilde yazın

        Scanner scan = new Scanner(System.in);
        System.out.print("Yasinizi Giriniz...: ");
        int yas = scan.nextInt();


        try {
            if(yas<1) {


            throw new IllegalArgumentException();
            }else
                System.out.println("yaşınız"+yas);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.printf("yaş negatif olamaz");
        }
    }
}
