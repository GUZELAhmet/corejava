package practive;

import java.util.Scanner;

public class Q8_Scanner01 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin
        Scanner Scan=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz");
        int x= Scan.nextInt();
        System.out.print("ikinci sayıyı giriniz");
     int y= Scan.nextInt();

     int toplam=x+y;
        System.out.println("toplam = " + toplam);


    }
}
