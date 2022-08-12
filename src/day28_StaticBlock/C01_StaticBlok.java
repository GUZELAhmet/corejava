package day28_StaticBlock;

public class C01_StaticBlok {
    static int sayi;
    static {
        System.out.println("static blok calisti");
        /*   static blok class uyelerinin tamamından once calısır
        * main methoddan bile önce
        *
        * static blok class oluştulduğunda çalışır genellikle class ile
        * ilgili ön ayarlamalr veya static variabllere değer
        *  atamak için kullanılır
        *
        *
        *static blok class içerisinde nerede olduğu önemli değildir
        * önce static bloklar çalışır
        *
        *
        * birden  fazle staticBlok varsa yukarıdan aşağıya doğru calışır*/
   sayi = 10;
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı");
        System.out.println(sayi);

    }
    static {
        System.out.println(" main method altındaki static method çalıştı");
    }


}

