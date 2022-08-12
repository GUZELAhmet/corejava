package day35_InhetritancetaConstructerkullanımı;

public class LOgretmen {
    LOgretmen() {
        System.out.println(" ogretmen parametresiz constructor çalıştı ");
    }

    LOgretmen(String name) {
        this();


        System.out.println(" Ogretmen parametreli constructor çalıştı ");
    }
}
