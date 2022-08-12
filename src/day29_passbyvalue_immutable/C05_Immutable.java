package day29_passbyvalue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim="mine";
        isim = isim.toUpperCase();
        System.out.println("isim = " + isim);// MINE
        isim="mevlut";
        System.out.println("isim = " + isim);

        for (int i = 0; i < 100; i++) {
            isim+=".";

        }
        System.out.println(isim);
    }
}
