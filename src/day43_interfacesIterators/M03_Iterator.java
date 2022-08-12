package day43_interfacesIterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //list deki tüm elementleri index kullnmadan 3 artırın

        for ( Integer each : list ) {

            System.out.print(each+3+" ");
        }
        System.out.println();
        System.out.println(list);
        // java index yapısı olmayan collection lardaki elementlere
       // ulaşmak ve değiştirmek için ıterator interface ini oluşturmuştur

        // Iterator interface olduğundan ondan obje üretmemiz mümkün değildir.
        // bunun yerine bize Iterator döndüren list.Iterator() methodunu kullanırız


        Iterator it1=list.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
        //System.out.println(it1.next());//element kalmadığı için RTE verir

        // Iterator da geri dönüş yok adımadım sona ulaştıktan sonra basa gelmek için
        //yeni bir Iterator oluşturmamız gerekir
        Iterator it2=list.iterator();
        it2.next();
        it2.remove();
        System.out.println(list);
        it2.next();
        it2.remove();
        System.out.println(list);
        it2.next();
        it2.remove();
        System.out.println(list);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println( "yeniden liste"+list);

        Iterator it3=list.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loopl tan sonra list"+ list);

    }
}
