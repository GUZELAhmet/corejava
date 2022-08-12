package day28_StaticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {
       /* %25 indirimli fiyatı hesaplayıp biz döndüren bir method oluşturun*/

      double satisfiyati=100;
      double indirimoranı=20;
        double indirimlFiyat=indirimliFiyatHesapla(satisfiyati,indirimoranı);
        System.out.println(indirimlFiyat);

    }

    public static double indirimliFiyatHesapla(double xyz,double oran) {
        double indirimlFiyat=xyz *(1-oran/100);
        return indirimlFiyat;
    }


}
