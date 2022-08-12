package practive;

import java.sql.SQLOutput;

public class Q5_EscapeSeqence
 /*
    Çocuklara layık olmayan karakterlerini ve teslimatlarına yönelik kullanımlar .
    Başlangıcı, satır başı gibi bir okul eğitimi ve geri kaçış için dizilerini kullanma.
	  \n (veya \r): yeni bir satırdan başlar: bir alt satirdan itibaren yazdirir.
	          \t: yatay sekme : yatay yatayda 1 sekmeli miktari kaydirir.
	          \\: ters eğik çizgi yazdırır :\ (ters eğik çizgi) yazdirir
	          \': tek tırnak yazdırır :' tek tırnak yazdırır.
	          \": çift tırnak yazdırır :"" çift tırnak yazdırır.
	 \: ters eğik çizgi
	 /:ön eğik çizgi
	 */
{

    public static void main(String[] args) {

        // Soru-1 : konsola "Merhaba", "Dünya \ //" seklinde yazdiriniz
        System.out.println("\" hello\", \" World \\ // \" ");

        // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek yazacak olanınız.
        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");


        //Soru-3 : "Java" ile hayat cok 'afilli' yazdiriniz
        System.out.println(" \"Java\" ile hayat cok \'afilli\'   ");

        //Soru-4 : "Zaruret" insanı
        //         'kasif' yapar yazdiriniz
        // "TechProEd ile java cok..." 3 satir sonra ve satirdan kolay 1 tab ileride yazilsin, tüm tek kod bilgisi ile yazdiriniz.
        System.out.println("\"Zaruret\" insanı \n\'kasif\' yapar \n \n\n\t  \"TechProEd ile java cok...\" ");




    }
}
