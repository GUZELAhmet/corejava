package practive;
import java.util.Locale;
import java.util.Scanner;
public class Q12_IfStatment03 {
    public static void main(String[] args) {
        System.out.println("lütfen iş ilanınınızı giriniz");
        Scanner scan =new Scanner(System.in);
        String jobtitle= scan.nextLine().toLowerCase();

        if (jobtitle.equals("qa")) {
            System.out.println("Quality Analyst");
        }else if(jobtitle.equals("dev")){
            System.out.println("developer");
        }else if(jobtitle.equals("ba")){
            System.out.println("Bussiness analyst");

        } else if (jobtitle.equals("pm")) {
            System.out.println("Project Manager");
        }



        switch(jobtitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlis formatta jobtitle bilgisi girdiniz...");
                break;
        }
        }



    }


