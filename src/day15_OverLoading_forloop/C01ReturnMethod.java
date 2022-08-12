package day15_OverLoading_forloop;

public class C01ReturnMethod {

    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=5;

        int sonuc=carpgetir(sayi1,sayi2);
        System.out.println("sonuc = " + sonuc);
    }

   public static int carpgetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;
        return sonuc;
    }
}
