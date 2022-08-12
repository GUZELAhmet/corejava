package day10_StringManiplasyon;

public class C04_equalsIgnorCase {
    public static void main(String[] args) {


        String str1="";
        String str2="ali can";
        String str3="ALI CAN";
        String str4="Ali Can_";
        String str5="Ali Can";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.length());

    }
}
