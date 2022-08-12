package day32_strinbuilder;

public class C05_indexof_lastindexof {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pay attention please");

        System.out.println("sb.indexOf(\"Pay\") = " + sb.indexOf("Pay"));//0

        System.out.println("sb = " + sb);//sb = Pay attention please

        System.out.println(sb.indexOf("e"));//7

        System.out.println(sb.indexOf("e", 10));//16 10 dan ileri doğru arar

        System.out.println(sb.lastIndexOf("e"));//19

        System.out.println(sb.lastIndexOf("e", 10));//7 10 dan geri doğru arar
    }

}
