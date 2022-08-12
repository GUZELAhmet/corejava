package day25_constructer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_contructor {

    public static void main(String[] args) {

        C01          obj1       =new         C01();
        //class adı   obje adi    keyword    constructors

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        List<String> list= new ArrayList<String>();
        //List<String> list2= new List<String>();
        /* javada bir obje oluşturabilmek ,
        için mutlaka contructor kullanmalısınız
         */
        System.out.println(obj1.sayi );
        obj1.deneme();
    }
}
