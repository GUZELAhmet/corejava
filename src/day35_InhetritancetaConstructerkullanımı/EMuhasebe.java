package day35_InhetritancetaConstructerkullanımı;

public class EMuhasebe extends DPersonel{


    EMuhasebe(){
        System.out.println("EMuhasebe parametresiz constructor çalıştı");
    }
    EMuhasebe(String name){
        System.out.println("EMuhasebe parametreli constructor çalıştı");
    }
}
