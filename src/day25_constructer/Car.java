package day25_constructer;

public class Car {
    /* bu class bizim kalıphanemiz bir araba oluşturmak için ihtiyacımız olan variable ve methodları bu
    class tabelirleriz sonra farklı classllarda araba olusturmamız gerekirse bu classtan bir obje olusturup
    burada belirlenen variable ve methodlara göre araba uretilir.

     */

   public String marka="Marka belirtilmedi";
   public String model="model belirtilmedi";
    public int yil;
   public int fiyat;

    public void benzinliArac(){
        System.out.println("bu ara. benzinli motora sahiptir");
    }
    public void maxHiz(int hiz){
        System.out.println("bu ara. maxHiz"+ hiz+ "km hız yapar");
    }
}
