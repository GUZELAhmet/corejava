package day27_staticKeyword;

public class c01 {
    static int sayi=10;
    int rakam=5;
/*
class levelde iki tür variable vardır
static (class) variable
inc-stance (obje) variable
static  variable tum class ta kullanılabilirken inctance olanlar
sadece statik olmayan methodlarda  direk kullanılabilir
inctance variabllara static methodtan ulaşmak,
 istersek obje oluşturmamız gerekir

 instance variable obje variable olduğu için herhengi bir satırda inctance variable
 değerinin ne olduğunu bulmak için **obje oluşturulan*** satırdan ititbaren kod incelenmelidir

 static variable class variable olduğu için herhengibir satırda static
 variable değerini bulmak için **classın başından** ititbaren kod incelenmelidir


*/

    public static void main(String[] args) {
     c01 obj1= new c01();
        System.out.println("obj1 rakam değeri"+obj1.rakam);//5
        System.out.println("obje 1 sayi değeri"+sayi);//10

        obj1.rakam+=1;//5+1
        obj1.sayi+=1;//10+1

        System.out.println("1 artırdıktan sonra obj1 rakam değeri"+obj1.rakam);//6
        System.out.println("1 artırdıktan sonraobje 1 sayi değeri"+obj1.sayi);//11

        c01 obj2 = new c01();

        System.out.println("obj2 rakam değeri"+obj2.rakam);//5
        System.out.println("obj2 sayi değeri"+obj2.sayi);//10

        obj2.rakam++;//5+1=6
        obj2.sayi++;//11+1=12

        System.out.println("1 artırdıktan sonra obj2 rakam değeri"+obj1.rakam);//6
        System.out.println("1 artırdıktan sonra obj2 sayi değeri"+obj1.sayi);//12

    }


}
