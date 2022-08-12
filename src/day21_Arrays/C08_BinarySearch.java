package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {

    public static void main(String[] args) {
        /* javada elaman aramanın
        kısa yoludur binary seach çalışması için arrayın
        sıralı hale getirilmesi gererkir
         */
        String[] harfler={"Y","B","D","G","0"};
        String arananHarf="Y";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));

        // binaryseach vize aradığımız elemanın indexini döndürür
        // array sıralı olmadığı için arama sonucunu doğru bulmayabilir
        Arrays.sort(harfler);
        System.out.println(Arrays.binarySearch(harfler,arananHarf));


    }
}
