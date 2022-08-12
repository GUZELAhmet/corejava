package d13;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //kullanicidan bir sifre girmesini isteyin.
        //       Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        //sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //       - Ilk harf buyuk harf olmali
        // Son harf kucuk harf olmali
        // Sifre bosluk icermemeli
        // Sifre uzunlugu en az 8 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen şirenizi giriniz"   );
        String sifre= scan.nextLine();
        int kontrol=0;
        // ilk harf kontrolü
        if(sifre.charAt(0)>='A' && sifre.charAt(1)<='Z') { kontrol++;
        } else System.out.println("ilk harf büyük harf olmali" );


        //son harf kontrolü
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1 )<='z'){ kontrol++;

        }else System.out.println("son harf küçük harf olmalidir    ");

        // bosluk kontrolü
        if ( sifre.contains(" ")) {
            System.out.println(" sifre bosluk içermemeli");
        } else kontrol++;

    //sifre kontorlü
        if (sifre.length()>80)  { kontrol++;  }
        else System.out.println("sifre enaz 8 karakter olmalı");

        if (kontrol==4){
            System.out.println("sifre basarı ile tamamlandı");
        }else System.out.println("işlem başarısız");
    }
}
