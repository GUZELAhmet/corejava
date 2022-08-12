package day29_passbyvalue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /* verilen 4 elemanlı bir array i methoda gönderelim
        method da yeni üç elemanlı bir array atayıp bu yeni arraya
        rasgele 100 den küçük 3 sayı atayalım methodda arrayı yazdılaım
        main methoddada method call dan sonra yeniden yadırlaım
         */
        int[] arr={3,5,7,8,10};
        arrayiDegisitir(arr);
        System.out.println("method içinde"+ Arrays.toString(arr));

    }

    public static void arrayiDegisitir(int[] arr) {
        arr= new int[3];
        Random rand= new Random();
        arr[0]=rand.nextInt(100);
        arr[1]=rand.nextInt(100);
        arr[2]=rand.nextInt(100);
        System.out.println("method içinde"+ Arrays.toString(arr));
    }
}
