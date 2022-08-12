package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkharf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        char Ilkharf=scan.next().toUpperCase().charAt(0);
        //java scanner clasında next char metodu yoktur
        // bunun yerine strin olarak ilk kelimeyi alıp onunda ik harfini alabiliriz
        System.out.println("ismin ilk harfi :" + Ilkharf);
    }
}
