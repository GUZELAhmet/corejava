package day26_constructer;

import day25_constructer.Car;

public class ArabaRunner {
    public static void main(String[] args) {

//  bir önceki car clasından obje oluşturalım
        /* faklı bir packagedaki bir class tan obje oluşturduğum
        muzda acces modifer larıda dikkate almalıyız
         */
    Car car1= new Car();
        System.out.println(car1.fiyat);
        /* araba clasından bir obje oluşturduğumda eğer bir dafult costracter kullanılmışsa
        tüm özelikler için tej tek değer atamamız gerekir
         */
        araba araba1= new araba();
       araba1.fiyat=15000;
        araba1.yil=2001;
        araba1.marka="toyota";


        System.out.println("araba1.marka = " + araba1.marka);
        System.out.println("araba1.model = " + araba1.model);
        System.out.println("araba1.fiyat = " + araba1.fiyat);
        System.out.println("araba1.yil = " + araba1.yil);
        /* eğer bir objeyi oluştururken bazı özlelikleri argument olarak
        belirtip o zeliklkleri bir obje oluşturmak istersek itiraz edeer
        cunku her class ta default consrruvcter vardır
        ama  oda parametrsizdir.
        bizim yeni constructer lara ihtiyaçımız var
         */

      // araba araba2= new araba("bmw","5.20",2011,150000);

}
}