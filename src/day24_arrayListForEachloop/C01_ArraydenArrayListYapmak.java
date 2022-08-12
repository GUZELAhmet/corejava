package day24_arrayListForEachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
    String[] arr={"ismail","Nurullah","fatih"};
    //uzun listeler olusturmamiz gerektiğinde tektek eklemek yerine Array oluşuturup
        //bunları liste çecirmek daha pratik olur
       /* 1- loop ile arraydeki tüm elementleri liste atabiliriz
       2- Array.asList() kullanabiliriz
       ancak bu methodun iki tane yan etkisi var
       - Array clasi kullanıldığı için Array ozellikleri gecerli olur
       dolayısıyla list te olan add , rremove gibi size değiştiren methodlar bu şekilde oluşturuluan
       listelerde kullanılamaz
       - kaynaka olan array ile urun olan list ozdeslestrilir
       birinde yapılan değişiklik diğerinde otomatik olarak yapılmış olur
        */
        List<String> siniflist= Arrays.asList(arr);
        System.out.println(siniflist);

       //1. yan etkisi
        //siniflist.add("Erdi");//.UnsupportedOperationException
       // siniflist.remove(1);  UnsupportedOperationException

        //2.yan etkisi
        arr[1]="emre";
        System.out.println("değişim sonrası array"+ Arrays.toString(arr));
        System.out.println("siniflist = " + siniflist);

        siniflist.set(0,"utku");
        System.out.println("listi değiştirince  list = " + siniflist);
        System.out.println("listi değiştirince Array = " + Arrays.toString(arr));



    }
}
