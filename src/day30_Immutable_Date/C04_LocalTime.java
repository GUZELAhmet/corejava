package day30_Immutable_Date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException
    {

        LocalTime time =LocalTime.now();
        /* bizim oluşturduğumuz date ve time canlı değildir
        localTime kullandığımız satırda bizim variable ımıza stor eder
         */

        System.out.println("time = " + time);

        Thread.sleep(3000);
        time=LocalTime.now();
        System.out.println("time = " + time);


    }
}
