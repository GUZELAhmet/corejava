package day22_MultiDimensiyonelArray;

import java.util.Arrays;

public class C04_MdaisteneneArrayolusturma {
    public static void main(String[] args) {
        //Asagidaki multi dimensional array’in ic array’lerindeki
        // tum elemanlarin toplamini  birer birer bulan ve herbir sonucu yeni bir
        // array’in elemani yapan ve yeni array’i  ekrana  yazdiran bir program yaziniz
        // { {1,2,3}, {4,5}, {6,7} }
        // Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] yeniArray = new int[sayilar.length];
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {// i 0 1 2 değerlerini alir
            for (int j = 0; j < sayilar[i].length; j++) {// inner arrayın uzunluğuna bağlı
                toplam += sayilar[i][j];
            }
            yeniArray[i] = toplam;
            toplam = 0;

        }
        System.out.println("istenen yeni array:"+ Arrays.toString(yeniArray));
    }
}
