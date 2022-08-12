package day46_Maps;

import com.sun.jdi.connect.Connector;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> siniflist = new HashMap<>();

        siniflist.put(101,"Ali, Can, JDev");
        siniflist.put(102,"Enes, Cem, Tester");
        siniflist.put(103,"Taha, Emre, JDev");
        siniflist.put(104,"Derya, Deniz ,Tester");
        System.out.println( siniflist);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz ,Tester}

        System.out.println( siniflist.keySet());//[101, 102, 103, 104]
        System.out.println( siniflist.values());//[Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz ,Tester]
        System.out.println( siniflist.size());//4


       // tüm öğrencierin bilgilerini alt alta yadırın
        Collection<String> tumvalueColl=siniflist.values();
        int sira=0;
        String [] eachArr;
        for(String each: tumvalueColl){


            eachArr = each.split(", ");
            System.out.println(sira+ "- "+ eachArr[0]+ "  "+ eachArr[1]);
            sira++;
        }
    }
}
