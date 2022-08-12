package day18_whiledowhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int pozitifsayiAdedi=0;
        int negatifSayiAdedi=0;
        int pozitifsayilarToplami=0;

        do{
            System.out.println("toplamakak için pozitif tams sayı giriniz");
            sayi=scan.nextInt();
            if(sayi>0) {
                pozitifsayilarToplami+=sayi;
                pozitifsayiAdedi++;
            }else if(sayi<=0){
                negatifSayiAdedi++;
                System.out.println("negatif sayigiremezsiniz");
            }



        }while(sayi!=0);
        System.out.println("pozitifsayilarToplami = " + pozitifsayilarToplami);
        System.out.println("pozitifsayiAdedi = " + pozitifsayiAdedi);
        System.out.println("negatifSayiAdedi = " + negatifSayiAdedi);

    }
}
