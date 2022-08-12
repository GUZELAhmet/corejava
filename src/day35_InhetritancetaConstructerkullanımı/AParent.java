package day35_InhetritancetaConstructerkullanımı;

public class AParent extends AGrandParent {
    protected  String isim="Parent isim belirtilmedi";
    protected String parentKulupAdi="parent kuluubu";

    public AParent() {
        System.out.println("Parent constructer çalıştı");
    }
}
