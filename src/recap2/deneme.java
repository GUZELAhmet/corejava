package recap2;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Armstrong sayisi olup olmadigini kontrol etmek icin bir sayi giriniz :");
        int n;// = scan.nextInt();

        int sumOfCubes = 0;
        int temp ;
        int digit = 0;
        for (int i = 100; i < 10000; i++) {

       n=i;
       temp=i;
        while(n>0) {
            digit = n%10;
            sumOfCubes = sumOfCubes + digit*digit*digit;
            n = n/10;
        }
        if(temp==sumOfCubes) {
            System.out.println(temp + " Armstrong sayidir");
        }
            sumOfCubes = 0;

            digit = 0;
        }
    }
}
