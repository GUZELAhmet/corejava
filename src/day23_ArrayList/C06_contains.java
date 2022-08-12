package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_contains {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println(urunler.contains("Nutella"));
        System.out.println(urunler.contains("ddd"));

        List<String> urunler2=new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Cekirdek");

   System.out.println(urunler.contains(urunler2));
} }
