package recap2;

public class Q04_NestedIfandTernary {
      /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

    public static void main(String[] args) {
        int i=3;
        String sonuc="";

        if (i>0 && i<=9){
            if (i==9){   System.out.println("dokuz");}
            else if (i==8){   System.out.println("sekiz");}
            else if (i==7){   System.out.println("yedi");}
            else if (i==6){   System.out.println("altı");}
            else if (i==5){   System.out.println("beş");}
            else if (i==4){   System.out.println("dört");}
            else if (i==3){   System.out.println("üç");}
            else if (i==2){   System.out.println("iki");}
            else if (i==1){   System.out.println("bir");}
            else System.out.println("sıfır");

        }else System.out.println("geçersiz sayı");

        sonuc= i==9?"dokuz":i==8?"sekiz":i==7?"yedi":i==5?"beş":i==4?"dört":i==3?"üç":i==2?"iki":i==1?"bir":i==0?"sıfır":"geçersiz";
        System.out.println("sonuc = " + sonuc);




    }
}
