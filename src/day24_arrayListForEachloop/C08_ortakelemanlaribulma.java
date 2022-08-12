package day24_arrayListForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C08_ortakelemanlaribulma {
    public static void main(String[] args) {
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
        //each loop
        //kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        String[] arr1={"ali","veli","can","ayse"};
        String[] arr2={"ali","veli","can","ayse"};
       List<String> ortakisimler= new ArrayList<>();

        for (String each1: arr1
             ) {
            for (String each2: arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakisimler.add(each1);
                }
            }

        }
        if (ortakisimler.isEmpty()){
            System.out.println("hic ortak eleman yok");
        } else System.out.println("ortakisimler"+ ortakisimler);

    }
}
