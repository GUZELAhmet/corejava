package day35_InhetritancetaConstructerkullanımı;

public class Matematikciler extends LOgretmen {

    Matematikciler () {
        System.out.println(" matematik parametresiz constructor çalıştı ");
    }
    Matematikciler (String name) {
        this();

        System.out.println(" matematik parametreli constructor çalıştı ");

    }

    public static void main(String[] args) {
        Matematikciler obj1 = new Matematikciler("ali");
    }
    /*
    this() ; içinde bulunduğu constructorları
    super() parent de bulunan constructorları çağırır


     */
}
