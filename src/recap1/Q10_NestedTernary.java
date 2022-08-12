package recap1;

public class Q10_NestedTernary {


    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        char finalnotu='D';
        String result = finalnotu=='A'?"gayet başarılı":finalnotu=='B'?"Başarılı": finalnotu=='C'?"Ha gayret":"diğerleri";
        System.out.println("result = " + result);


    }


}
