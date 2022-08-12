package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_Linkedlist_listdataturu {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();


        ll2.add("berk");
        ll2.add("enes");
        ll2.add("ayse");
        ll2.add("ali");
        System.out.println("ll2 = " + ll2);//ll2 = [berk, enes, ayse, ali]

        System.out.println("ll2.remove(3) = " + ll2.remove(3));//ll2.remove(3) = ali
        // eğer liistemiz ınteger elenetlerdden oluşuyorsa
        //direk sayı yasarzak index olarak kabul eder
        //bir variable atama yapar ve remove da o variblenın ismin yazarsak o zman obje olarak alır


        System.out.println("ll2.remove(3) = " + ll2.remove("kemal"));//false

        System.out.println("ll2.isEmpty() = " + ll2.isEmpty());//false

        ll2.set(1,"serap");
        System.out.println(ll2);//[berk, serap, ayse]

        ll1.add("berk");
        ll1.add("ismail");
        System.out.println("ll1 = " + ll1);//ll1 = [berk, ismail]

        ll2.retainAll(ll1);// ll2 dekş tüm elentleri ll1 ile karşılaştırır
                                     // ll1 olmayanları siler
        System.out.println("ll2 = " + ll2);//ll2 = [berk]
        System.out.println(ll2.hashCode());//3020251
         ll2.add("fatih ");
        System.out.println(ll2.hashCode());//-1188024659


    }


}
