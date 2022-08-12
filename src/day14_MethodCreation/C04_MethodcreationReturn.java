package day14_MethodCreation;

public class C04_MethodcreationReturn {

    public static void main(String[] args) {
        // verilen isim ve soyisimi ilk harfi buyuk
        //geriye kalanı harfler  * olacak şekilde
        // yazdrıan bir method oluşturun
        //bize bu halini gönderen  methodu oluşturun

        String isim="Enes";
        String soyisim="Bozkurt";
        String gizliisim= isimGizle(isim,soyisim);

        System.out.println("gizliisim = " + gizliisim);

    }

    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\w","*");
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        return isim+" "+ soyisim;
    }
}
