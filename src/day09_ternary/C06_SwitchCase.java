package day09_ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {
        String input = "pazartesi";
           input=input.toLowerCase();

        switch (input) {
            case "pazartesi":
                System.out.println("hafta içi");
                break;
            case "salı":
                System.out.println("hafta içi");
                break;
            case "çarşamba":
                System.out.println("hafta içi");
                break;
            case "perşembe":
                System.out.println("hafta içi");
                break;
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
                System.out.println("hafta sonu");
                break;
            case "pazar":
                System.out.println("hafta sonu");
                break;
        }

            switch (input) {
                case "pazartesi":

                case "salı":

                case "çarşamba":

                case "perşembe":

                case "cuma":
                    System.out.println("hafta içi");
                    break;
                case "cumartesi":

                case "pazar":
                    System.out.println("hafta sonu");
                    break;

        }
    }
}