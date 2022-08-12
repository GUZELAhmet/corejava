package day22_MultiDimensiyonelArray;

import java.util.ArrayList;
import java.util.List;

public class C09_get {
    public static void main(String[] args) {
        List<Integer> sayilar1= new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler = new ArrayList<>();
        isimler.add("ahmet");
        isimler.add("ayse");
        isimler.add("ali");
        isimler.add("veli");
        System.out.println(isimler.get(2));
        System.out.println(sayilar1.get(1));


    }
}
