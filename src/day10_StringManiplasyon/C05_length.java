package day10_StringManiplasyon;

public class C05_length {
    public static void main(String[] args) {
        String str1="java ögren işi kap";


        System.out.println(str1.charAt(str1.length()-1));

        //javada null pointer bir değer degil karşısına yazılan variablenin hiç bir değer almadığının işaretçisidir


    String str3=null;   // str3 ye bir değer atanmışmıdır hayır
        // null bu değer atayı işaret etmektedit
         System.out.println(str3.length()); // Nullpointer Exeption olarak hata verir.
}
}
