package day14_MethodCreation;

public class C01_MethodCreation {

    public static void main(String[] args) {
        terstenYazdir("sali");


    }

    public static void terstenYazdir(String input)  {
        String tersInput=input.substring(3 )+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1 );
        System.out.println("tersInput = " + tersInput);


    }
}
