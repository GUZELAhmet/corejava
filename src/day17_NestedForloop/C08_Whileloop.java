package day17_NestedForloop;

import java.util.Scanner;

public class C08_Whileloop {
    public static void main(String[] args) {
     /*
  kullanicidan toplanmak uzere sayilar alin
  sayilarin toplami 500'u gecince
  sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

  13 sayi girdinz ve toplamlari 567
 */
 int toplam=0;
 int sayi=0;
 Scanner scan = new Scanner(System.in);
 while (toplam< 500) {
     System.out.println(" bir sayı girin");
     toplam+=scan.nextInt();
     sayi++;



 }
        System.out.println("toplam = " + toplam);
        System.out.println("sayi = " + sayi);
    }
}
