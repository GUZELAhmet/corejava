package day21_Arrays;

import java.util.Scanner;

import static java.awt.geom.Path2D.contains;

public class C03_Contains {
    //Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip,
    // bize true veya false sonucu donen bir method olusturun.
    public static void main(String[] args) {
        String[] isimler={"başak","nurullah","fatih","adem","enes"};
        Scanner scan =new Scanner(System.in);
        System.out.println("aradıgınız ismi yazınız");
        String arananKelime = scan.nextLine();

  boolean sonuc=contains(arananKelime,isimler);
if (sonuc) {
    System.out.println("girlen sism listed var");
} else System.out.println("girilen sism listede yok");
    }

    public static boolean contains(String arananKelime, String[] isimler) {
        boolean sonucMethod=false;

        for (int i = 0; i < isimler.length ; i++) {
            if (arananKelime.equalsIgnoreCase(isimler[i])){
                sonucMethod=true;
            }

        }


        return sonucMethod;

    }
}
