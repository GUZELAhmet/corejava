package day36_inheritanceDataTypeKullanımı;

public class Cmemur extends BMuhasebe{
    int saatUcreti=12;
    int gunlukMesai=9;

    protected void maas(){
        System.out.println("memurlar : " + (30*saatUcreti *gunlukMesai)+" maaş ücreti alır");



    }
    protected void ozelSigorta(){
        System.out.println("memurlara ücretsiz olarak özel sigorta yapılır");
    }

    public static void main(String[] args) {
        Cmemur mmr1 = new Cmemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();//3240 maaş ücreti alı
        mmr1.ozelSigorta();
        mmr1.sigorta();
        System.out.println(mmr1.isim);
        System.out.println(mmr1.soyisim);
        System.out.println(mmr1.deparman);

        BMuhasebe mhsb = new BMuhasebe();
         /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */

        System.out.println(mhsb.gunlukMesai);//8
        System.out.println(mhsb.saatUcreti);//10
       mhsb.maas();//   2400 maaş ücreti alı
       mhsb.ozelSigorta();// muhasebe
       mhsb.sigorta();//muhasebe
        System.out.println(mhsb.isim); //isim belirtilmedi";"
        System.out.println(mhsb.soyisim);//soyisim belirtilmedi
        System.out.println(mhsb.deparman);//deparman belirtilmedi

    }
}
