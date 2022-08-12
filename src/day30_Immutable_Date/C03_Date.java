package day30_Immutable_Date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);//2022-07-23
        System.out.println(tarih.getDayOfYear());//204
        System.out.println(tarih.getYear());//2022
        System.out.println(tarih.getDayOfWeek());//SATURDAY
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.getMonth());//july


        LocalDate tarih2 =LocalDate.of(2001,5,15);
        System.out.println("tarih2 = " + tarih2);//2001-5-15

        LocalDate tarih3 =LocalDate.of(1982, Month.JULY,1);
        System.out.println("tarih3 = " + tarih3);//1982-07-01

        System.out.println(tarih.plusDays(100));//2022-10-31

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//2027-11-04

        System.out.println(tarih.minusWeeks(20));//2022-03-05

        System.out.println(tarih.isAfter(tarih2));//true

        //iki farklı doğum günü gilidiğinde hangisinde doğanın büyük olduğunu
        // tarih2  ve tarih3 için yapalım

        if(tarih2.isAfter(tarih3)){
            System.out.println(tarih3+ " tarihinde doğan daha büyük");
        }else if (tarih2.isBefore(tarih3)) System.out.println(tarih2+ " taihinde doğan daha büyük");
        else System.out.println("ikiside aynı tarihte doğmuş");


    }
}
