package day29_passbyvalue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
  bir list olusturalim
  iki ayri method'dan birinde
  sadece elemanlari degistirelim

  digerinde yeni bir list atayip,
  ayni sayida yeni leman ekleyelim

  ve her iki method call'dan sonra kendi listemizi
  main method icerisinde kontrol edelim
 */
        List<String> list = new ArrayList<String>();
        list.add("ali");
        list.add("vali");
        list.add("can");
        System.out.println("ilkbaşta list"+list);
        elemanlariDegisitir(list);
        System.out.println("elemanlariDegisitir metodundan sonra mainde"+list);
        listdegistir(list);
        System.out.println("listdegistir metodundan sonra mainde"+list);

    }

    public static void listdegistir(List<String> list) {
        list= new ArrayList<String>();
        list.add("ala");
        list.add("vala");
        list.add("canavna");
        System.out.println(" listdegistir den sonra"+list);
    }

    public static void elemanlariDegisitir(List<String> list) {
        list.set(0,"oguz");
        list.set(1,"Murat");
        list.set(2,"fatih");
        System.out.println("eleman değitir den sonra "+list);
    }
}
