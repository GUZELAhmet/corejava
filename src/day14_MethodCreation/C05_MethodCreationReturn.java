package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {

    public static void main(String[] args) {
       /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip bunu da kalici olarak saklamak istersek
kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
sonucunu main methoda dondurebiliriz
Return type'ı void olmayan bir methodun soncunu main method'da bir variable'a atama yaparsak programin geri kalaninda
bu yeni degeri kullanma sansimiz olur

 */

        //kullanicidan sehir isminni ve dogum tarihi alip
        //bunları promgamda kullanacagimiz formatta biz edonduren bir method  olusturun
        //sehir ismin programimizda buyuk harf olarak
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz
    String sehir=sehirAl();
    String tarih=tarihAl();
        System.out.println("girdiğiniz sehir : " + sehir+" girdiğiniz tarih :  " + tarih);
    }

    public static String tarihAl() {
       String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yili giriniz");
        int yil=scan.nextInt();

        if (yil>1900 && yil<2100){
            tarih=yil+ "-";
        } else System.out.println("yil için geçeli bir sayi yazmalisiniz(1900-2100)");

        System.out.println("kacinci ay oldugunu tamsayi olarak giriniz");
        int ay=scan.nextInt();
        if(ay<0 ||ay>12) {
            System.out.println("Ay no 1-12 arasında olmalıdır");
        }else if(ay<10) {
            tarih=tarih+"0"+ay+"-";
        } else tarih=tarih+ay+"-";

        System.out.println("ayin kacinci günü oldugunu tam sayi olarak giriniz");
        int gun=scan.nextInt();

        if (gun<=0 || gun>31) {
            System.out.println(" gun no olarak 1-31 arasında giriniz");
        }else if(gun<10) {
           tarih=tarih+"0"+gun;
        }else{ tarih= tarih+gun;}
    return tarih;
    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen sehir adi griniz");
        String sehirAdi=scan.next().toUpperCase();
        return sehirAdi;
    }
}
