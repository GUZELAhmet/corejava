package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_Likedlist_DequeDataTürü {
    public static void main(String[] args) {
        Deque<String> ll4= new LinkedList();
        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("tevfik");
        ll4.add("selim");
        ll4.add("veli");
        ll4.add("selim");

        ll4.removeLastOccurrence("selim");//
        System.out.println("ll4 = " + ll4);//ll4 = [cavidan, mesut, tevfik, selim, veli] sondan siler
        System.out.println(ll4.pop());//cavidan
        // linklistin başındki elentl silip bize getirir

        ll4.remove();
        ll4.removeLast();
        ll4.removeFirst();
        //deque iki taraflı demektir dolayısıyla her methodun first ve lastı vardır
        System.out.println("ll4 = " + ll4);

    }
}
