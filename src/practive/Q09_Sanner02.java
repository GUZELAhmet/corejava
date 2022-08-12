package practive;

import java.util.Scanner;

public class Q09_Sanner02 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line
        Scanner scan = new Scanner(System.in);

        System.out.println("adınızı giriniz");
        String ad=scan.nextLine();

        System.out.println("Memleketinizi giriniz");
        String mem=scan.nextLine();

        System.out.println("konumunuzu giriniz");
        String konum=scan.nextLine();

        System.out.println("yaşınızı giriniz");
       int yas =scan.nextInt();

        System.out.println("boyunuzu giriniz");
        double boy =scan.nextDouble();

        System.out.println("yaşadığınız "+konum+ "u  sevyormusunuz  true /false");
       boolean seviyorMu =scan.nextBoolean();


        System.out.println("adın = " + ad);
        System.out.println("memleket = " + mem);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("konum = " + konum);
        System.out.println("seviyorMu = " + seviyorMu);

    }
}
