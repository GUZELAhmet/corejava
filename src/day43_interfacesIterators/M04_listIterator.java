package day43_interfacesIterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_listIterator {
    public static void main(String[] args) {
        /* list iterator iterator interfacenin child interface dir
        ama daha çok methoda sahipttir
         */
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
    Integer temp;
        ListIterator lit1 =list.listIterator();
        while(lit1.hasNext()) {
            temp=(Integer) lit1.next()+3;
            lit1.set(temp);


        }
        System.out.println(list);
    }
}
