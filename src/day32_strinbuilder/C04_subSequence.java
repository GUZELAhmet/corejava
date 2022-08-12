package day32_strinbuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kayra");
        sb.substring(0, 3);
        System.out.println("sb = " + sb);// Kayra

        sb.subSequence(2,4);
        sb.insert(0,"c");
        System.out.println("sb = " + sb);
    }
}
