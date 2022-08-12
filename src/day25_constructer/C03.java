package day25_constructer;

public class C03 {
    /* proje oluşturuken bazi classlar run etmek için
    değil variable
    yada method olusturup bunları baska classlarda
    kullanmak için olusturulur

     */

    /* default constructor parametseizdir
    göremesek bile ihityaç oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturusak
    java default constructorı siler

     */

    C03() {


    }
     /* olusutdugumuz parametresizbu constructor
        default constructor ile birebir aynıdır
        ama bir olusturdugumuz icin buna default
        constructor deyemeyiz
        parametresiz constructor deriz

         */

    String isim="ahmet";
    public void method01() {
        System.out.println("C03 method calısti");
    }



}
