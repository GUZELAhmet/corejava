package day36_inheritanceDataTypeKullanımı;

public class DIsci extends BMuhasebe {
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void maasisci() {
        System.out.println("isciler : " + (30 * saatUcreti * gunlukMesai) + " maaş ücreti alır");


    }

    protected void ozelSigortaisci() {
        System.out.println("isicilere yüzde70 indirmli olarak özel sigorta yapılır");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();


        System.out.println(isc1.gunlukMesai);//8
        System.out.println(isc1.saatUcreti);//10
       isc1.maas();//2400 maaş ücreti alı
       isc1.ozelSigorta();
       isc1.sigorta();
        System.out.println(isc1.isim);
        System.out.println(isc1.soyisim);
        System.out.println(isc1.deparman);

        APersonel isc2=new DIsci();
        //System.out.println(isc2.gunlukMesai);//8
        //System.out.println(isc2.saatUcreti);//10
        isc2.maas();//2400 maaş ücreti alı
        //isc2.ozelSigorta();
        isc2.sigorta();
        System.out.println(isc2.isim);
        System.out.println(isc2.soyisim);
        System.out.println(isc2.deparman);


    }
}
