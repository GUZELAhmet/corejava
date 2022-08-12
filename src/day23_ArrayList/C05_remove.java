package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        System.out.println(sayilar1);
        sayilar1.add(1);
        sayilar1.remove(1);
        System.out.println(sayilar1);
       int sil= sayilar1.indexOf(5);
       sayilar1.remove(sil);
        System.out.println(sayilar1);


    }
}
