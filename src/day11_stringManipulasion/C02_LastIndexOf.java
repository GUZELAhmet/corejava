package day11_stringManipulasion;

public class C02_LastIndexOf {

    public static void main(String[] args) {
        String cumle = "java cok kolay, java çok guzel";
        String kelime = "kolay";


        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex == -1) {
            System.out.println("verilen kelime cümlede kullanılmammış");

        }else if (kelimeIlkIndex == kelimeSonIndex)  {
            System.out.println("verilen kelime cumlede 1 kere kullanılmış");
        }else {
            System.out.println("verilenk kelime cumlede çok kere kullanılmış");
        }
    }
}