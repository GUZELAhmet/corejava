package day25_constructer;

public class CarRunner {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.fiyat=15000;
        car1.yil=2001;
        car1.marka="toyota";
        System.out.println("car1.marka = " + car1.marka);
        System.out.println("car1.model = " + car1.model);
        System.out.println("car1.fiyat = " + car1.fiyat);
        System.out.println("car1.yil = " + car1.yil);

        Car car2= new Car();
        System.out.println("car2.marka = " + car2.marka);
        System.out.println("car2.model = " + car2.model);
        System.out.println("car2.fiyat = " + car2.fiyat);
        System.out.println("car2.yil = " + car2.yil);

    }
}
