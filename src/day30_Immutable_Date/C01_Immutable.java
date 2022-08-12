package day30_Immutable_Date;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("kenan");
      list.add("Enes");
      list.add("İsmail");
        System.out.println("liste = " + list);


        list.set(1,"Yaseming");
        System.out.println("list = " + list);

        list.remove(1);
        System.out.println("list = " + list);
    }
}
