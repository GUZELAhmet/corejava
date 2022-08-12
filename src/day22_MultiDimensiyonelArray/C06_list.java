package day22_MultiDimensiyonelArray;

import java.util.ArrayList;
import java.util.List;

public class C06_list {
    public static void main(String[] args) {
        /* array i array yapan [] idi
        arraylist te ise <> diomond(elmas kullanırız)
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); //[]
        isimler.add("basak");
        System.out.println(isimler.add("ayse"));//true
        System.out.println(isimler); //[basak, ayse]
    }

}
