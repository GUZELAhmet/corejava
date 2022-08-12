package day24_arrayListForEachloop;

public class C07_foreachloop {
    public static void main(String[] args) {
       /* Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin
       toplamini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.*/
    int[] sayilar={1,2,3,4,5,6,7,8,5,8,9,1,4};

    int toplam=0;
        for (int each: sayilar
             ) {
            toplam=each*each;

        }
        System.out.println("kareler toplamı .: "+  toplam);
    }

}
