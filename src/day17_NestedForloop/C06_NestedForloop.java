package day17_NestedForloop;

public class C06_NestedForloop {
    //verilen Stringi aşağıdaki gibi yazdıran  bir program yazdırın
// input deniz
    /*    D
           De
           Den
           Deni
           Deniz         */
    public static void main(String[] args) {

        String input = "Ahmet Güzel";
        String yedek = "";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));

            }
            System.out.println("");
        }
    } }