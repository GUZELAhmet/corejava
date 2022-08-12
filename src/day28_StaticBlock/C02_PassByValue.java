package day28_StaticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {


        double satisfiyati = 100;
        System.out.println(indirimliFiyat(satisfiyati));
    }

    public static double indirimliFiyat(double orjinalfiyat) {
        //%10 indiri yap yeni fiyatı main methoda döndür

        return orjinalfiyat * 0.9;
    }
}