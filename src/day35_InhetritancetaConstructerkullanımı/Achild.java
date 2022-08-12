package day35_InhetritancetaConstructerkullanımı;

import javax.imageio.stream.ImageInputStream;

public class Achild extends AParent{

    String isim ="Child isim belirtilmedi";
    protected String   childKulupAdi="child kuluubu";
    public Achild() {
        System.out.println("Child constructor çalıştı");

    }

    public static void main(String[] args) {
      //  AGrandParent gp1 = new AGrandParent();
        // bu objeyi oluşturmak için Granpa cons. çalışır
        // Parent veya child cons çalışmaz
        Achild chld1 = new Achild();
        chld1.granpaKulupAdi="child1";
        chld1.parentKulupAdi="child2";

        //*
        //        Java'da bir class'i kullanabilmek icin o class'dan obje olusturur, dolayisiyla o class'in constructor'ini
        //        kullanirdik.
        //
        //        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin constructorlarini otomatik
        //        calistiran bir yapi kurmustur.
        //
        //        Ornegin biz child class'inda Child class'indan bir obje olusturmak istedigimizde Child constructor'ini kullaniriz.
        //
        //        Java Child(){} gordugunde once parent'in constructor'ini calistirmam lazim der. Buradan parent constructor'a gider.
        //        Parent class'inda Parent(){} gorunce once bunun parent'inin yani Grandparent constructor'inin calismasi gerekir der.
        //        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak tum constructor'lari asagi dogru calistirir.
        //         */



    }
}

