package day04_evodevi;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayıyı gir");
        int sayi1= scan.nextInt();
        System.out.println("2. sayıyı gir");
        int sayi2= scan.nextInt();
        double sayi3= (double) sayi1/sayi2;
        System.out.println(sayi3);
    }
}
