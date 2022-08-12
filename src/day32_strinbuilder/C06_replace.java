package day32_strinbuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Calm down");
        sb.replace(5,10,"Up");
        System.out.println(sb);//Calm Up

        sb.replace(4,7,"----");
        System.out.println("sb = " + sb);//Calm----Up

        sb.replace(4,7," ");
        System.out.println("sb = " + sb);//
    }
}
