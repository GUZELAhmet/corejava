package day32_strinbuilder;

public class C07_equals {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        String str ="java";


        System.out.println(sb.equals(sb2));//false
        System.out.println(sb.equals(sb));//true
        System.out.println(sb.equals(str));//false

        System.out.println(sb.compareTo(sb2));//0

        StringBuilder sb3 = new StringBuilder("jave");//-4
        System.out.println(sb.compareTo(sb3));

        StringBuilder sb4 = new StringBuilder("jaba");//-4
        System.out.println(sb.compareTo(sb4));

    }
}
