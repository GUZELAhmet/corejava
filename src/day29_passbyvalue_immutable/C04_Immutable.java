package day29_passbyvalue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

        String str ="yildizbank";
        System.out.println(str.toUpperCase());//YILDIZBANK
        str.toLowerCase();


        System.out.println(str);

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);
        sb.append(".");
        System.out.println("sb = " + sb);



    }
}
