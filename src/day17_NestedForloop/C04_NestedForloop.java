package day17_NestedForloop;

public class C04_NestedForloop {

    public static void main(String[] args) {
        /* verilen inputa göre * larsdan oluşan bir üçgen oluşturun
         */
     int boy=4;
        for (int i = 1; i <= boy; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
