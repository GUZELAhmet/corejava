package day18_whiledowhile;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alin ve rakanmalrı toplamını bulan programi yazıi

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        int input = scan.nextInt();


        int rakamlarToplami = 0;
        int birlerBasamagi = 0;
        int temp = 0;

        while (temp > 0) {
            birlerBasamagi = temp % 10;
            rakamlarToplami += birlerBasamagi;
            temp /= 10;
        }



                System.out.println(input + "sayisinin rakamlar toplami = " + rakamlarToplami);


        }
    }

