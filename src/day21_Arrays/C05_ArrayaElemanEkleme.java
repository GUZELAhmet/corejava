package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayaElemanEkleme {
    //Verilen bir array’e yeni bir element ekleyen method olusturun
    public static void main(String[] args) {
        String[] siniflistesi={"Ali Can"};
        String eklenecekİsim="Murat Babayigit";

        siniflistesi=elemanEkle(siniflistesi,eklenecekİsim);
        System.out.println(Arrays.toString(siniflistesi));

    }

    public static String[] elemanEkle(String[] siniflistesi, String eklenecekİsim) {
        String[] yeniSiniflistesi=new String[siniflistesi.length+1];

        for (int i = 0; i < siniflistesi.length ; i++) {
            yeniSiniflistesi[i] = siniflistesi[i];

        }
        yeniSiniflistesi[yeniSiniflistesi.length-1]=eklenecekİsim;




    return yeniSiniflistesi;

    }


}
