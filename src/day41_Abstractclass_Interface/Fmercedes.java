package day41_Abstractclass_Interface;

public class Fmercedes extends DAraba{
    @Override
    public void motor() {
        /* abstract bir parentin cocrete child class inherit ederse paren abstarct classtaki tüm
        abstarct methodları override etmek zorundadır


        abstarct bir class abstract başka bir classi paren edinirse
        parent classtaki tüm abstarct methodları override etmek zorunda değildir
         */
    }

    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
}
