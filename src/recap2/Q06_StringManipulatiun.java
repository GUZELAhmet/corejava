package recap2;

import java.util.Scanner;

public class Q06_StringManipulatiun {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi
        // String manipulation method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk ve
// ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
   Scanner scan = new Scanner(System.in);
        System.out.println("String1: ");
        String str1 = scan.nextLine();
        System.out.println("String2: ");
        String str2 = scan.nextLine();

        System.out.println("1.yontem "+ str1+ " "+ str2);
        System.out.println("2.yontem "+ str1.concat(" "+ str2));

        System.out.println(str1.substring(1)+" "+ str2.substring(1));







    }

}
