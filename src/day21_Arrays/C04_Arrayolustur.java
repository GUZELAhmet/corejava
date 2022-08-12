package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrayolustur {
    //Kullanicidan bir array’in boyutunu ve tum elementlerini alarak
    // bir array olusturup, bu array’i bize donduren bir method olusturun
    public static void main(String[] args) {
        int sayilar[]=arrarOlustur();
        System.out.println(Arrays.toString(sayilar));
    }

    private static int[] arrarOlustur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanli bir array olusturmamai isterssiniz");
        int uzunluk=scanner.nextInt();
        int[] olustural = new int[uzunluk];
        for(int i=0; i<olustural.length; i++){
            System.out.println(i+". index icin sayi giriniz");
            olustural[i]=scanner.nextInt();
        }


        return olustural;
    }
}
