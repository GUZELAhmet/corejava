package day09_ternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println( "lütfen bir sayı giriniz");
        double sayi = scan.nextDouble();
        System.out.println(sayi>0 ? sayi: (-1* sayi));




    }
}
