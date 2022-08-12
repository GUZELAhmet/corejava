package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        // bir tam sayı ve bir char değişken oluşturun toplamını yapın
         int sayi=10;
         char harf='a';
        System.out.println(sayi+ harf);
        /* char data tipi işleme girdiği değişkenin türüne göre farklı davranabilir */
        String str="banan";
        System.out.println(str+harf);
        System.out.println(sayi*harf);
        // char sayi2=2; bu atama kabul edilebilir değildir.
        System.out.println(""+sayi+harf);
    } // str + harf  String data tipi çok güçlüdür .  hangi data türü ile işleme girerese girsin kendine benzetir
}
