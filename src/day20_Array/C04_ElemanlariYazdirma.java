package day20_Array;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {
        int sayilar[]={1,2,3,4,5,6,7,};
        System.out.println(Arrays.toString(sayilar));
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(" " + sayilar[i]);
        }
    }
}
