package day42_AbstarctClases_interface;

import static day42_AbstarctClases_interface.I03_Interface.SAYI;

public class K_childClassOfinterfaces implements I02_Interfaces,I03_Interface {
    /* bir class i bir interface child  yapmak için implements keyword kullanılır



     */
    public static void main(String[] args) {
        System.out.println(I03_Interface.SAYI);
        System.out.println(I02_Interfaces.SAYI);
    }
}
