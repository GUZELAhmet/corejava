package day14_MethodCreation;

public class C02_MethodCreation {


    public static void main(String[] args) {
        //verilen 3 basamaklı bir sayının
        //rakamlarToplamini yazdıran bir method oluşturalım
   int input=423;
   rakamlaritopla(input);
   C01_MethodCreation.terstenYazdir("nuri");


    }

    public static void rakamlaritopla(int input) {
        int birlerBasamagi =0;
        int rakamlarToplami=0;
        int temp=input;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girdiğiniz "+temp+" rakamlar toplamı"+rakamlarToplami);

    }
}
