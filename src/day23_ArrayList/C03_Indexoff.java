package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Indexoff {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler  );
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler);

        System.out.println(urunler.lastIndexOf("Ikram"));

        urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.lastIndexOf("Ikram"));
        System.out.println(urunler.indexOf("Ikram"));

        System.out.println(urunler.indexOf("dere"));

    }
}
