package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {
/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    System.out.println("kilonuzu giriniz kg");
    double kilo=scan.nextDouble();
    System.out.println("boyunuzu giriniz m");
    double boy=scan.nextDouble();
    double vki=kilo/boy;
    System.out.println("vki = " + vki);

    if(vki<=20)  {
        System.out.println("oldukça zyıfsınız");
    }else if(vki<=25){
        System.out.println("normal sınırlardasınız");
    }
    else if(vki<=30){
        System.out.println("şişman kategorisindesiniz");}
        else{
            System.out.println("obez gurubundasınız");
        }
    }

}


