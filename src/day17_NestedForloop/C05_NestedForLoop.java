package day17_NestedForloop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /* verieln inputa göre yıldızlardan olusan asagidaki sekli olusturun
        *
        ***
        ****
        *****
        ****
        ***
        **
        *
         */
        int boy=4;
        for (int i = 1; i <= boy; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* " );

            }
            System.out.println("");
        }
        for (int k = boy-1 ; k >= 1; k--) {
            for (int l = k; l >=1; l--) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
