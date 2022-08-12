package day24_arrayListForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C06_forEachLoop {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,50,1,};
        List<Integer> list = new ArrayList<Integer>();
        // arraydeki tüm elemanları inceleyelim tek sayı olanları alıp liste atalım

        // gelecek dataların türü,looop içinde ne isim verdiğim,nereden aldığım
        for (int each:arr
             ) {
            if (each%2==1){
                list.add(each);
            }
        }
        System.out.println("list = " + list);


    }
}
