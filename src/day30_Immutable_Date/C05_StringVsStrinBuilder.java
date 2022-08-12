package day30_Immutable_Date;

import java.time.LocalTime;

public class C05_StringVsStrinBuilder {
    /*stringmi yoksa stringbuilder midaha hızlıdır
    *bunu için 1000 kere sonuna nokta ekleyelim öncesinde ve sonrasın da zamanı alıp aradaki farkı bulalım */
    public static void main(String[] args) {


        LocalTime baslangic=LocalTime.now();
        String str="Ahhh Java";

        for (int i = 0; i <10000 ; i++) {
            str +=".";
        }
        LocalTime bitis=LocalTime.now();
        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);
        System.out.println("Strin Zamanı"+(bitis.getNano()-baslangic.getNano()));

       baslangic=LocalTime.now();
        StringBuilder sb = new StringBuilder("Ahhh Java");

        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
      bitis=LocalTime.now();
        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);
        System.out.println("Stringbuld Zamanı"+(bitis.getNano()-baslangic.getNano()));


        System.out.println(bitis.getSecond()); //dakika getirir

        System.out.println(bitis.plusSeconds(10000));// 10000 saniye sonra

        System.out.println(bitis.minusMinutes(2000));// 2000 dk önce
        System.out.println("bitis = " + bitis);
        System.out.println(bitis.withHour(3));//saat kımını 3 yapar
    }
}
