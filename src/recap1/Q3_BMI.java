package recap1;

import java.util.Scanner;

public class Q3_BMI {

    /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("kilonuzu giriniz kg");
        double kilo=scan.nextDouble();
        System.out.println("boyunuzu giriniz m");
        double boy=scan.nextDouble();
        double vki=kilo/boy;
        System.out.println("vki = " + vki);


    }
}
