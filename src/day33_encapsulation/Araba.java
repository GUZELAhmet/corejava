package day33_encapsulation;

public class Araba {
    String marka="marka belirlenmedi";
   private String model="model belirlenmedi";
    private  String yakit="Elektrikli";//tüm arabalar elektrikli ise variablein değiştirirlmemesi lazım

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
