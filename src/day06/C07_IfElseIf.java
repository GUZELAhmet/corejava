package day06;

import java.util.Scanner;

public class C07_IfElseIf
{
    public static void main(String[] args)
    {
        /*
        bir onceki soruda, kullanici negatif deger girerse uyaralim
        NOT : birden fazla if - else if birbirine baglanmissa
        son durum onemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if(yas<0){
            System.out.println("Lutfen gecerli bir yas yaziniz");
        } else if (yas<65){
            System.out.println("emekli olamazsin, "+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");
        }
        //Scanner scan = new Scanner(System.in);
//
        //System.out.println("lütfen yaşınızı giriniz");
        //int yas = scan.nextInt();
       //f (yas<0) System.out.println("lütfen geçerli bir yaş yazınız");
        //else if (yas < 65) {
        //    System.out.println("emekli olamassın "+ (65-yas)+ "çalışmalısın");
        //} else {
        //    System.out.println("emekli olabilirisin");
        //}
    }
}
