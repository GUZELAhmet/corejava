package recap2;

public class Q01_SwitchCase {
    /*
   gunleri gösterebilen bir program yazın
   gun Pazartesi veya Sali ise:
   Java dersi gunleri
   gun Persembe veya Cuma ise:
   Selenyum dersi gunleri
   gun carsamba veya cumartesi ise:
   SQL dersi gunleri
   aksi halde: izin gunu
   (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {

        String gun = "çarşamba";
        switch (gun) {
            case "pazartesi":

            case "salı":
                System.out.println("java dersi");
                break;
            case "çarşamba":
            case "cumartesi":
                System.out.println("SQl dersi");
                break;
            case "perşembe":
            case "cuma":
                System.out.println("Selenyum dersi");
                break;
            default:
                System.out.println("bu gün dersiniz yok");
        }

    }


}
