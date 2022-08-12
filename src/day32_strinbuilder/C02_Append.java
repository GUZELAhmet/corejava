package day32_strinbuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5+9+"java daha ne yapsın");
        sb.append("?");
        System.out.println("sb = " + sb);//java daha ne yapsın?
        sb.append(5);
        System.out.println("sb = " + sb);//java daha ne yapsın?5

        sb.append(true);
        System.out.println("sb = " + sb);//java daha ne yapsın?5true
        sb.insert(5,true);
        System.out.println("sb = " + sb);//java truedaha ne yapsın?5true

        System.out.println(sb.insert(22, "valla valla", 5, 11));//java truedaha ne yapsı vallan?5true
    }
}
