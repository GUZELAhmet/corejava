package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismin soy ismin ve yaşını alıp
        // girilen bilgiler = seyfi çapar 34 şeklinde yazdırın
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizigiriniz");
        String isim = scan.nextLine();
           // verileri  scanner ile alırken next yada nexline kullanılabilir
        // next tek kelime alır
        // nextline satır sonuna kadar alır
        System.out.println("lütfen soy isminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("lütfen syaşınızı giriniz");
        double yas=scan.nextDouble();
        System.out.println( "girilen bilgiler:"+isim+" " + soyisim+ " "+ yas);
    }
}
