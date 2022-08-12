package day30_Immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {
        //iki tarih arasındaki zamanı bulma
        LocalDate tarih1= LocalDate.of(1982,7,18);
        LocalDate bugün= LocalDate.now();

        Period period= Period.between(tarih1, bugün);
        System.out.println("period = " + period);


    }
}
