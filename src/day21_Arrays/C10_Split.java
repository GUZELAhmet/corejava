package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        //split() methodu bir array metodu değil strin metodudur
        //ama bir array döndürdüğü için bu konuda anlatıuoruz

        String str = "java ne kadar güzel";

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        String[] kelimelerNe = str.split(" ne");
        System.out.println(Arrays.toString(kelimelerNe));
        String[] kelimelere = str.split(" e");
        System.out.println(Arrays.toString(kelimelere));
        String[] kelimelerasd = str.split("");
        System.out.println(Arrays.toString(kelimelerasd));
    }
}