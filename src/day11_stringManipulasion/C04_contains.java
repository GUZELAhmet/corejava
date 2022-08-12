package day11_stringManipulasion;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen email.adresini gitiniz?");
        String email=scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adrresini giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("email adrseniz kaydedildi");

        } else {
            System.out.println("lütfen yazımı kontrol edin");

        }


    }
}
