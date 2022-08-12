package day11_stringManipulasion;

public class C06_endsWith {
    public static void main(String[] args) {

        String str = "ah ve java";
        System.out.println(str.endsWith("ava")); //true
        System.out.println(str.endsWith("ve java")); //true
        System.out.println(str.endsWith("hava")); //true
        System.out.println(str.endsWith("")); //true

    }
}
