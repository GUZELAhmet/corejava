package day07;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("0-100 arasında not giriniz");
        int not= scan.nextInt();


         if (not<0 || not >100){
             System.out.println("geçersiz not girişi");
         } else if (not<50) {
             System.out.println("Notunuz:D");
         }
         else if (not<60) {
             System.out.println("Notunuz:C");
         }
         else if (not<80) {
             System.out.println("Notunuz:B");
         }
         else  {
        System.out.println("Notunuz:A");
    }
}  }

