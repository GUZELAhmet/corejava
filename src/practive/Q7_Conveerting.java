package practive;

import java.util.Scanner;

public class Q7_Conveerting {
    public static void main(String[] args) {
         /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */
        int galon=5;
        double litre= galon*3.785;
        String sonuc1=galon+" galon değeri "+litre+ "litreye eşittir";
        System.out.println(sonuc1);

      int l=1000; //litre
        double g=l/3.785;
        System.out.println(l+" litre değeri "+ g + "Galona eşittir");

        Scanner scan =new Scanner(System.in);
        System.out.print(" fahrenayt degerini giriniz :");
        double fh= scan.nextDouble();
          // c = (f-32)*5/9
        System.out.println(" girdiginiz fahrenayt degerinin : "+(fh-32)*5/9 +" santigrata esdegerdir.");

    }
}
