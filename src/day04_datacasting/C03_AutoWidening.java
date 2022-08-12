package day04_datacasting;

public class C03_AutoWidening {
    public static void main(String[] args) {
        byte s1= 23;
        short s2=55;
        int s3= s1+s2;
        double s4=s1*s2;
        //  s4=s2/s1; s2 ve s1 tam sayı olduğu için sonuç 2,0 olur

        s4=(double)s2/s1; // sayılardan birini double yapmak gerekir
        System.out.println(s4);

    }
}
