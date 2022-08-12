package day43_interfacesIterators;

public class C02_child implements I01_InterfaceBodyOlanmethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
     parent interface de abstarct olan 3 methodu implement ettiğimizde java itirazını durdurur
     sonradan eklediğimiz default veya static keyvord ile tanımladığımız methodları implement
     etmememiz sorun oluşturmadı

    *
    *
    * */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanmethod.direksiyon();
        C02_child obj= new C02_child();
        obj.teker();
    }
}
