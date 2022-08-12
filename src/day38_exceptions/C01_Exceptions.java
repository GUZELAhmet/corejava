package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
int a=100;
int b=50;
int sayac=1;
        while(sayac<100){


            if(b==0){
                System.out.println("bölen sıfır olduğu için sonuç yok");
            }else  System.out.println(a/b);
            b--;
            sayac++;
        }


}
}
