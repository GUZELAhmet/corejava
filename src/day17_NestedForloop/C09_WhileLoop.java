package day17_NestedForloop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan bir sifre girmesini isteyin.
        //       Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        //sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //       - Ilk harf buyuk harf olmali
        // Son harf kucuk harf olmali
        // Sifre bosluk icermemeli
        // Sifre uzunlugu en az 8 karakter olmali
        Scanner scan = new Scanner(System.in);
        String sifre="";
       boolean sifrebasarılımı=false;
        int kontrol=0;

       while(!sifrebasarılımı) {
           System.out.println("lütfen şirenizi giriniz"   );
           sifre= scan.nextLine();

        // ilk harf kontrolü
        if(sifre.charAt(0)>'A' || sifre.charAt(0)<'Z') { kontrol++;
        } else System.out.println("ilk harf büyük harf olmali" );


        //son harf kontrolü
        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1 )<='z'){ kontrol++;

        }else System.out.println("son harf küçük harf olmalidir    ");

        // bosluk kontrolü
        if ( sifre.contains(" ")) {
            System.out.println(" sifre bosluk içermemeli");
        } else kontrol++;

        //sifre kontorlü
        if (sifre.length()>8)  { kontrol++;  }
        else System.out.println("sifre enaz 8 karakter olmalı");

        if (kontrol==4){
            System.out.println("sifre basarı ile tamamlandı"); sifrebasarılımı = true;
        }else //sifre basarısız;
             // tekrar basa donecek
           // kontrol değişkenini sıfırla
   kontrol = 0;
       }
    }
}
