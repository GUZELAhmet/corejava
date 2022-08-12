package day39_Expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_IOExpection {
    public static void main(String[] args) throws FileNotFoundException {
       int k;
        try {
            FileInputStream fis = new FileInputStream("src/day39_Expection/Test.txt");

            while ((k=fis.read()) != -1) {
                System.out.print((char) k);
            }



        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı ");;
        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadı");;
        }
    }
}
