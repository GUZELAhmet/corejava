package day39_Expection;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {
        String str;
       //  System.out.println(str);   değer ataması olmadan bir değişken kullanmaya
        //  çalışırsanız java compile da bunu fark eder çalıştırmaz
    str=null;
        //System.out.println(str.length());  .NullPointerException

        Object obj="java java java";
        Integer sayi=(Integer)obj;//.ClassCastException
       /*
        String str2="hava civa";
        Integer sayi2=str2;
        java bazı casting işlemlerine compile time izin vermez
        ancak bazen sintex uygun olabilir bu durumda codun çalışmasına ititraz etmez
        */
    }
}
