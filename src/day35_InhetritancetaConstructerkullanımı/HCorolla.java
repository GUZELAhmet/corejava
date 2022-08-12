package day35_InhetritancetaConstructerkullanımı;

public class HCorolla extends GToyota{
    public HCorolla() {
        System.out.println("HCorolla parametresiz constructor çalıştı");
    }
    public HCorolla(String name) {
        super(name);
        System.out.println("HCorolla parametreli constructor çalıştı");
    }
}
