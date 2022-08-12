package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        urunler.add("Nutella");

        System.out.println("urunler = " + urunler);
        System.out.println(urunler.remove("Nutella"));
        System.out.println(urunler.remove("aa"));

        System.out.println("urunler = " + urunler);
        System.out.println(urunler.remove(1));
        System.out.println("urunler = " + urunler);
    }
}
