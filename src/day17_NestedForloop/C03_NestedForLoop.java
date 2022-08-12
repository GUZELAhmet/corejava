package day17_NestedForloop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        // verieln en boy değerine göre yıldızlardan oluşan bir dikdörtgen oluşturun

    int en=3;
    int boy=4;
        for (int i = 1; i <= boy; i++) {
            for (int j = 1; j <=en; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }
}
