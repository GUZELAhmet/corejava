package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Expection {
    public static void main(String[] args) {
        /**   verielen marketteki tüm ürünleri bir markette tuttuğumuz varsayalım
         * kullanıcıya index sorup  o index teki urunu yazdıran bir program hazrlayalım
         *  kullanıcı urun sayısından buyuk bir index girer se expection  vermesinin önüne geçelim


         */
        String[] urunler={"nutella","cokokrem","sut","çay","fımdık"};

        Scanner Scan = new Scanner(System.in);
        System.out.println("istediğiniz urunun sira numarasını giriniz");

        int istenenIndex=0;
        try {
             istenenIndex=Scan.nextInt();
        } catch (InputMismatchException deneme) {
            System.out.println("urun indexi için bir tam sayı girmeniz gerekli");
        }
        try {
            System.out.println(" istediğin index teki ürün"+urunler[istenenIndex-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girdiğiniz sıra no listede bulunmuyor"+ "\n sıra numarasını en fazla "+(urunler.length)+"olabilir");
        }

    }
}
