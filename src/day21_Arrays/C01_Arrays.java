package day21_Arrays;

public class C01_Arrays {
    //Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
    public static void main(String[] args) {
        int sayilar[]={3,5,7,1,4,9,5,2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
      int maxSayi=sayilar[0];

        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i] > maxSayi) {
                maxSayi=sayilar[i];
            }
        }
        System.out.println("maxSayi = " + maxSayi);
    }
}
