package day35_InhetritancetaConstructerkullanımı;

public class FMemur extends EMuhasebe {
    /**
     * EXtendt keyword kullanılan classlarda
     * ister default constructor bulunsun
     * istersek de biz yeni constructor(lar) oluşturalım
     * java constructorin ilk satırına
     * super(); constructor coll yazar  *
     *
     * super constructor coll default constructora benzer geörünmesede orada vardır ve çalışır
     * ancak biz ilk satıra farklı bir constructor call yazarsak super constructor ı siler
     */

    FMemur(){

        System.out.println("memur parametresiz constructor çalıştı");
    }
    FMemur(String name){
        System.out.println("memur parametreli constructor çalıştı");
    }

    public static void main(String[] args) {
        FMemur mmr1 = new FMemur("ali");

    }
}
