package day25_constructer;

public class C01 {

    /* java oop konsept kullandığı için
    oluşturulan her bir
    clasın ihtiyaç olduğunda obje
    üretebilmesine uygun dizayn etmiştir
    ama her clastan obje üretilmeyebilir bunun için
    java ihtiyaç halinde kullanılması için
    her class ta default bir constructor koymuştur

    bu deault constructor class tan obje
    olusturldugunda
    otomatik olarak calışır

    orneğin bu classta constructor gorunmememsıne ragmen
    C02 clasında icinde olduğumuz C01 class ından bir
    obje üretebildik
     */
    int sayi;
    public void deneme() {
        System.out.println("Co1 den deneme methodu");
    }
}
