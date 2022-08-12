package day11_stringManipulasion;

import java.sql.SQLOutput;

public class C01_IndexOf {

    public static void main(String[] args) {


        String str = "Java ogrenmek cok guzel";
        //


        System.out.println(str.indexOf('g')); //  6
        System.out.println(str.indexOf('r'));  // 7
        System.out.println(str.indexOf('j'));  // -1

        System.out.println(str.indexOf("mek"));  // 10
        //eğer istediğimiz indexten sonrasını kontrol etmek istersek o zman aynı methodu
        //iki paremetrreli olarak kullanabiliriz

        System.out.println(str. indexOf('g',6));// yazılan indexten başlar

        //yukarıdaki str da 2. ve 3. e nin indexlerini bulun
        // 2. eyi bulabilmek için 1. enin indexine ihtiyacım var
        int ilke=  str.indexOf('e');
        int ikincie= str.indexOf('e', ilke+1);
        // eğer ikinci e varsa 3. enin olup olmadığını
        // ve varsa indexiniyazdıralım
       //  if(ikincie==-1){
         //    System.out.println("verilen str da e hari yok");
         //}
         //Else {
           //  int ucuncue=str.indexof("e",ikincie+1);
            //if (ucuncue == -1) {
              //  System.out.println("verilen str de 3. e yok");
            //} else {
              //  System.out.println("verilen str de 3. enin indexi :"+  ucuncue);
        //}

    }
}
