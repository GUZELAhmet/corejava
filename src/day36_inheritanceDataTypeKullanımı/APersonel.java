package day36_inheritanceDataTypeKullanımı;

public class APersonel {

    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String deparman="deparman belirtilmedi";

    protected  void maas(){

        System.out.println("tüm personelimiz maaş alırk");
    }
    protected void sigorta(){
        System.out.println("tüm personelimiz sigorta yapılır");
    }
}
