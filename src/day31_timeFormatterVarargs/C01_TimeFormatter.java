package day31_timeFormatterVarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat);
         //2022-07-25T21:41:19.769005600

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println("dtf.format(tarihSaat) = " + dtf.format(tarihSaat));
       //25/7/22 09:45

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println("dtf1.format(tarihSaat) = " + dtf1.format(tarihSaat));//25/Tem/2022 21:47
    }
}
