package day09_ternary;

import java.util.Scanner;

public class C03_ternary {

    public static void main(String[] args) {
        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println( "lütfen bir sayı giriniz");
        double sayi = scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
    }else{
            System.out.println("ltfen bir sayı giriniz");
            double sayi1 = scan.nextDouble();
            System.out.println(sayi*sayi1);

} }}
