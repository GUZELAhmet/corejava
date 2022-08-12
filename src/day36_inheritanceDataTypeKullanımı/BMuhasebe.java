package day36_inheritanceDataTypeKullanımı;

public class BMuhasebe extends APersonel {
    protected int saatUcreti=10;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("personel min : "+ (30*gunlukMesai*saatUcreti)+ " maas alır");
    }
    protected void ozelSigorta(){
        System.out.println("isteyen çalşanlara yüzde 50 indirili özel sigorta yapılır");
    }
}
