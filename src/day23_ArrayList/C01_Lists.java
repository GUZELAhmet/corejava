package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println(sayilar1.size());
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1.size());
        System.out.println(sayilar1.set(4,9));
        System.out.println(sayilar1);
       /*
Set methodu istenen index'deki eski elementi silip
yerine verdigimiz yeni elementi set eder.

Eger eski elementi silmek istemiyorsak add (index,deger) methodu kullanabiliriz

set () sildigi eski elementi de bize dondurur.
 */


    }
}
