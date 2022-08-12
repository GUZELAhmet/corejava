package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {
        Queue<String> ll3=new LinkedList();

        ll3.add("adem");
        ll3.add("zeyneo");
        ll3.add("hpolat");
        ll3.add("kadir");
        // queue kuyruk demekti
        //sıra önemlidir gelen sona gelir giden baştan gider

        System.out.println("ll3 = " + ll3);
        System.out.println("ll3.remove() = " + ll3.remove());//ll3.remove() = adem

        System.out.println("ll3 = " + ll3);//ll3 = [zeyneo, hpolat, kadir]

        System.out.println("ll3.remove(\"Hpolat\") = " + ll3.remove("Hpolat"));//ll3.remove("Hpolat") = false

        System.out.println("ll3.element() = " + ll3.element());//ll3.element() = zeyneo
        System.out.println("ll3.peek() = " + ll3.peek());//ll3.peek() = zeyneo

        Queue<String> ll4= new LinkedList();
        //System.out.println("ll4.element() = " + ll4.element());//NoSuchElementException
        // peek ve element silmeden ilk elementibize döndürür  aradaki fark peek null döner
        //element exception  verir
        ll3.offer("ahmet");// sona ekler
        System.out.println("ll3 = " + ll3);

        System.out.println(ll3.poll());//zeyneo

        System.out.println(ll3);//[hpolat, kadir, ahmet]

       // System.out.println("ll4.remove() = " + ll4.remove());//exception verir

        System.out.println(ll4.poll()); //null
    }
}
