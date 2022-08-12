package day07;

import java.util.Scanner;

public class C01_IfElseIfStatemebt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");
        String gun = scan.nextLine().toLowerCase();
        if (gun.equals("pazartesi")) {
            System.out.println("paz");
        } else if (gun.equals("salı")) {
            System.out.println("sal");
        } else if (gun.equals("çarşamba")) {
            System.out.println("çar");
        } else if (gun.equals("perşembe")) {
            System.out.println("per");
        } else if (gun.equals("cuma")) {
            System.out.println("cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("cmt");
        } else if (gun.equals("pazar")) {
            System.out.println("pzr");
        }
    }
}
