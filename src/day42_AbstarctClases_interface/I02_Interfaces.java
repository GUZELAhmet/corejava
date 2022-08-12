package day42_AbstarctClases_interface;

import java.util.List;

public interface I02_Interfaces {
    int SAYI=30;
    /* interface bir class değildir

    abstract classlar javada abstraction (soyutlaştırma/ kural koyma) illemini yapıyordu
    ancak abstract bir classta abstract olamayan methodlarda olabilirbuda full abstraction
    yapmaya izin vermez

    eğer javada içinde hiç concrete method olmasın
    dediğimiz class oluşturmak istiyorsak bunu class değil interface yapmamız gerekir

 1-interfacelerde concrete method olamaz

 2-interfaceler full abstraction yaptiğindan interfacelerde obje oluşturulamaz

   List <String> get= new List<>();  çalışmaz
   bunuh yerine costructer list in childi olan ArrayList den seçeriz

3- classlarda bir child birden fazla parent edinemez ama interfaceler de concrete method olmadığından
biz her methodu child classlarda override etmek zorundayız
override ederken kimin söylediğini override ettiğimizn önemi yok


4-interfaceler neyin yapılacağını söyler ama nasıl yapılacağına karışmaz

    */


}
