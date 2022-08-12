package day14_MethodCreation;

public class C03_MethodCreation {

    public static void main(String[] args) {
        // input olarak verilen isim ve soyismi
        // ilk harfi büyük geriye kalan harfler  * olacak şekilde
        // I****** K*** şeklinde yazdıran bir method oluşturalım

        String isim ="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim, soyisim);
        C02_MethodCreation.rakamlaritopla(895);
    }

    public static void ismiGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
    }
}
