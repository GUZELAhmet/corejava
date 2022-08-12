package day33_encapsulation;

public class Tasit {
    private String tasitTuru;
    private boolean muayeneVarMI;
    private int yili;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    //return olmadığı icin bu methodun cağırıldığı tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir satırlık islemde bizim gönderdiğimiz parametreyi instence variable a atıyor.

    public boolean isMuayeneVarMI() {
        return muayeneVarMI;
    }

    public void setMuayeneVarMI(boolean muayeneVarMI) {
        this.muayeneVarMI = muayeneVarMI;
    }

    public int getYili() {
        return yili;
    }

    public void setYili(int yili) {
        this.yili = yili;
    }
}
