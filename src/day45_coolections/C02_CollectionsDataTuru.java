package day45_coolections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        colloctions <datatürünü> object seçmeniz durumunda
        collectiona farklı data türünden objeler koyulmasına izin verir depolama olayında kolaylık sağlar
        ancak işlem yaparken tüm objeleri object olarak tanımladığımızdan çok fazla casting yapmamız
        gerekebilir


         */
        List<String> list = new ArrayList<>();
        //list.add(5);
        //list.add('f');
       // list.add(true);
        List list1  = new ArrayList<>();
        list1.add(5);
        list1.add('f');

        list1.add(true);
        list1.add("ali");
        System.out.println("list1 = " + list1);//[5, f, true, ali]
        list1.set(0,(Integer)list1.get(0)+5);
        list1.set(3,list1.get(3)+"can");
        list1.set(2,!(Boolean) list1.get(2));

        System.out.println("list1 = " + list1);//[10, f, false, alican]

        Set<Object> set1=new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('e');

    }
}
