package day41_Abstractclass_Interface;

import java.sql.SQLOutput;

public abstract class EToyota extends DAraba{

    @Override
    public void motor() {
        System.out.println("toyota arabalar çevreci motor kullanır");
        /* parent classtaki standart belirleyici methodların  abstract
        tamamı child class tarafından override edilmelidir

        concrete methodların override edilme mecburiyeti yoktur
         istersek override yapabiliriz

         */
    }



}
