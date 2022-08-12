package day32_strinbuilder;

public class C01_OlusturmaYöntemleri {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Candır");
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println("sb.length() = " + sb.length());//0
        System.out.println("sb.capacity() = " + sb.capacity());//16

        System.out.println("sb2.length() = " + sb2.length());//11
        System.out.println("sb2.capacity() = " + sb2.capacity());//27


        System.out.println("sb3.length() = " + sb3.length());//0

        System.out.println("sb3.capacity() = " + sb3.capacity());//10
        sb.append("java");
        System.out.println("sb.length() = " + sb.length());//4
        System.out.println("sb.capacity() = " + sb.capacity());//16
        sb.append(" Candir");
        System.out.println("sb.length() = " + sb.length());//11
        System.out.println("sb.capacity() = " + sb.capacity());//16
        sb.append(" Biel bilir");
        System.out.println("sb.length() = " + sb.length());//22
        System.out.println("sb.capacity() = " + sb.capacity());//34
    }
}
