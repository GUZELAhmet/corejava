package day31_timeFormatterVarargs;

public class C03_VararagsileToplama {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        toplayazdir(sayi1, sayi2);
        toplayazdir(sayi1, sayi2,sayi3);
        toplayazdir(sayi1, sayi2,sayi3,sayi4);
    }

    public static void toplayazdir(int... sayi) {
      /* bu gösterim integer variablerdan oluşan bir varargs demektir
      varargs  array altyapısını kullanır.
       */
int toplam=0;
        for (int each:sayi ) {
            toplam+=each;

        }
        System.out.println("girlen"+ sayi.length+" sayı toplamı    " + toplam);

    }

}
