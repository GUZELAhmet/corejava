package day24_arrayListForEachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListolusturma {
    public static void main(String[] args) {
        /* icinde 200 tane 1000 den kucuk pozitif tam soyı olan bir list olusturun
        kullanıcıdan bir sayı isteyip
        listede var olup olamdığını kontrol edip kullanıcıya yazalım
         */
        Random rnd = new Random();
        int sayi=0;
        List<Integer> sayilistesi = new ArrayList<>();

        while (sayilistesi.size()<200){
            sayi=rnd.nextInt(1000);
            if(!sayilistesi.contains(sayi)){
                sayilistesi.add(sayi);
            }

        }
        System.out.println("sayilistesi = " + sayilistesi);
        Scanner scan = new Scanner(System.in);


        boolean knt=true;
        int tahminsayisi=1;
        while(knt){
            System.out.print("bir sayı girini");
            int temp = scan.nextInt();
            if(sayilistesi.contains(temp)){
                knt=false;
                System.out.println(tahminsayisi+" denemede sayı bulundu");
            } else{ System.out.println("tekrar ");
            tahminsayisi++;
            }

        }


    }
}
