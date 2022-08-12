package day39_Expection;

public class C03_Exceptions {
    public static void main(String[] args) {


    String str="123a5"; //

        int sayi= 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("yazdığınız değer sadece rakamlardan oluşmalıdır ");;
        }
        catch (Exception e) {
            System.out.println("öngörülemeyen bir hata oluştu ");;
        }

        System.out.println("Sayının karesi="+sayi*sayi);


        /**  kullanıcıdan string olarak değer alıyor ve bunu integer a çeviriyorsak
         * .NumberFormatException ile karşılaşabileceğimizi öngörürürz
         * NumberFormatException aldığımızda kodun durmamasını istiyorsak try catch ile çerreleyebiliriz

         eğer bilmediğimiz bir exception daha olursa


         */

    }  }
