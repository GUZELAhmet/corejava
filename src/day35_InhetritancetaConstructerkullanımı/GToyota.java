package day35_InhetritancetaConstructerkullanımı;

public class GToyota {

    public GToyota() {
        System.out.println("GToyota parametresiz constructor çalıştı");
    }
    public GToyota(String name) {
        // super(name);extends olamdığı için java kabul etmez
        System.out.println("GToyota parametreli constructor çalıştı");
    }
}
