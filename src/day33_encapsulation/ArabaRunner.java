package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba  arb1=new Araba();
       //arb1 objesi üzerinden marka
        // variable ina ulaşabildim değiştirebildim(set ),yazdırabildim(get)
        arb1.marka="toyata";
        System.out.println(arb1.marka);
        //acces modifier kullanarak marka variable ini tamamen açabilir
        //yada tamamen kapatabilirimi
        //private yaptığımda ise tamamen ulaşımı engelleyebilirim
        //yani acces modifier ya hep yada hiç diyor

        //markayı değiştirelim ama göremeyelim
        //yakıtıda görelim ama değiştirmeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska classlardan ulasmak mumkun olmadigindan
        // 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim
        arb1.setModel("supra");//model olarak supra yı atadık
        ////modeli yazdıramayız getter methodu yok

        System.out.println(arb1.getYakit()      );//elektrikli bilgisini yadırdık
        //yakıtı değiştiremeyiz cunku setter methodu yok

    }
}
