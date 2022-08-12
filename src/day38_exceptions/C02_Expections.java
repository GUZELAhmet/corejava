package day38_exceptions;

public class C02_Expections {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        int sayac=1;
        while(sayac<100){
// try bloğu yapmaya çalıştığımız ama risk olduğunu düşündüğ,müz işlemleri yazmak için kullanılır
            //catch den sonraki parantez karşılaşmayı beklediğimiz expection türünü javaya söylemek
            //için kullaılırve catch bloğu javaya söylediğimiz istani durum gerçekleşirse
            // javanın yapmasını istediğimiz işlem

            //catch bloğunun önündeki paranteze karşılaşmayı beklediğimiz expectionı yazabilir
            // yeva her türlü expectionda devreye girmesini istiyorsak tüm expectionların parentı
            //olan expection yazabiliriz

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda sıfır oldu dikkat ");
            }
            b--;
            sayac++;
        }


    }
}
