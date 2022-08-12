package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {




    List<String> urunler= new ArrayList<>();
    urunler.add("Nutella");
    urunler.add("ikram");
    urunler.add("cay");
    urunler.add("celirdek");

        List<String> eskiurunler= new ArrayList<>();
        String yeniurun="Bisktrem";
        String silinecekUrun="ikram";

        System.out.println(urunler.indexOf(silinecekUrun));
        int temp =urunler.indexOf(silinecekUrun);
        String silinenurun=urunler.set(temp,yeniurun);

        eskiurunler.add(silinenurun);
        System.out.println(urunler);
        System.out.println("eskiurunler = " + eskiurunler);

         yeniurun="kahve";
       silinecekUrun="cay";

        System.out.println(urunler.indexOf(silinecekUrun));
       temp =urunler.indexOf(silinecekUrun);
       silinenurun=urunler.set(temp,yeniurun);

        eskiurunler.add(silinenurun);
        System.out.println(urunler);
        System.out.println("eskiurunler = " + eskiurunler);

}
}