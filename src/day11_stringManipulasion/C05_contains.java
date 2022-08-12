package day11_stringManipulasion;

public class C05_contains {
    public static void main(String[] args) {

        String  cumle=" java buyuk dünya kucucuk";
        cumle=cumle.toLowerCase();

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println(" karar ver buyukmu istiyorsun kucuk mu");

        }else if(cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        }
            else if (cumle.contains("kucuk") ){
            System.out.println(cumle.toLowerCase());

        }
                else   {
            System.out.println(" cumle buyuk yada kucuk ıcermıyor");

        }
    }
}
