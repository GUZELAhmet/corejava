package day30_Immutable_Date;

import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihsaat=LocalDateTime.now();

        System.out.println("tarihsaat = " + tarihsaat);//2022-07-23T19:40:14.766894900

        System.out.println(tarihsaat.plusMonths(3).plusHours(100));//3 ay + 100 saat sonra

        System.out.println(tarihsaat.minusDays(100).minusHours(100));//100 gün+100saat önce

        System.out.println(tarihsaat.toLocalDate());// yıl - ay gün verir


    }
}
