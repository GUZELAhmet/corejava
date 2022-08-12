package day34_inheritans;

public class Toyota {
    protected String marka="Toyota";
    protected String model="model belirlenmedi";
    protected String yakit="yakit belirlenmedi";

    protected  void motor() {
        System.out.println("Toyota cevreci motor kullanır"  );
    }
    protected void aku(){
        System.out.println("Toyota modele göre aku kullanır");


    }

}
