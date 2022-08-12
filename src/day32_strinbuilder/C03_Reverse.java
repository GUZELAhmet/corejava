package day32_strinbuilder;

public class C03_Reverse {
    public static void main(String[] args) {
        /* verilen bir input u tersine ceviren bir method oluşturun*/
  String input="Hey gidi for loop günleri";

  String tersinput= tesineCevir(input);

    }

    private static String tesineCevir(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
}
