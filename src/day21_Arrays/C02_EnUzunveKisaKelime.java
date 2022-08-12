package day21_Arrays;

public class C02_EnUzunveKisaKelime {
    //Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun
    public static void main(String[] args) {
        String[] kelimeler={"erdal","onur","mehmet","hayrullah","mihrican"};

        enUzunveKisaYazdir(kelimeler);
    }

    private static void enUzunveKisaYazdir(String[] kelimeler) {
        String enUzunKelime=kelimeler[0];
        String enKisakelime=kelimeler[0];

        for (int i = 1; i < kelimeler.length; i++) {
            if (kelimeler[i].length()>enUzunKelime.length()) {
                enUzunKelime=kelimeler[i];
            }
            if (kelimeler[i].length()<enKisakelime.length()) {
                enKisakelime=kelimeler[i];
            }

        }
        System.out.println("enKisakelime = " + enKisakelime);
        System.out.println("enUzunKelime = " + enUzunKelime);
    }
}
