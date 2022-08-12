package day24_arrayListForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C05_istenmeyenlerisil {
    public static void main(String[] args) {
// Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[] sehirler={"İstanbul", "Ankara", "Mersin","Konya","Kastamonu"};
        String istenmeyenharf="a";
        List<String> kalanlar=new ArrayList<String>();


        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenharf))   {
                kalanlar.add(sehirler[i]);
                            }

        }
        //
        System.out.println("kalanlar = " + kalanlar);
        //yeni bir array olusturup listeyi aktaralım
        String[] kalanlararrayi=new String[kalanlar.size()];

        for (int i = 0; i < kalanlararrayi.length; i++) {
            kalanlararrayi[i]=kalanlar.get(i);
            sehirler=kalanlararrayi;
            System.out.println("sehirler arrayinin son hali"+ sehirler);

        }
    }
}
