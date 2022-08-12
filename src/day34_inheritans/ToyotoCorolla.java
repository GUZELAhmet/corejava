package day34_inheritans;

public class ToyotoCorolla extends Toyota {
/* child class tan parent clasa erişimde acces modifier kurallarını
by pass edemeyiz
örenğin parent class taki private class üylerini child class üzerinden kullanamayız
aynı şekilde parent ve child farkli classlarda ise
paret class taki defult acces modifieri olan class üyelerini child
class tan kullanamayız
 */
    public static void main(String[] args) {
        ToyotoCorolla arb1= new ToyotoCorolla();

        System.out.println(arb1.marka);
        System.out.println(arb1.model);

    }
}
