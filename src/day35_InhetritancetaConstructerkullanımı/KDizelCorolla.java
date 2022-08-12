package day35_InhetritancetaConstructerkullanımı;

public class KDizelCorolla extends HCorolla{
    public KDizelCorolla() {
        System.out.println("KDizelCorolla parametresiz constructor çalıştı");
    }
    public KDizelCorolla(String name) {
        super(name);
        System.out.println("KDizelCorolla parametreli constructor çalıştı");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1= new KDizelCorolla("ali");
    }
}
