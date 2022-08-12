package day41_Abstractclass_Interface;

public abstract  class DAraba {
    public static void main(String[] args) {
        // abstract class ta main method opsiyoneldir
        // Eğer abstract class sadece child classların taşımak zorunda olduğu özelikleri
        // belirlemek için oluşturlduysa main methoda ihityaç olmaz
        // sadece abstarct methodlar olur

        //bir abstract methodda standart belirleme dışında methodlar çalışabilir
        //bu durumda ihitiyaç olursa main method oluşturulabilir




        }

    public abstract void motor();
    public void klima(){
        // abstract olmayan methodlara concrete method denir.
        //abstract bir methodu abstractkeyword ile belirtmek zorunludur
        //concrete methodlarda bunu declare edilmesine gerek yoktur
        //biz sadece abstraction ile ilgili konuştuğumuzda abstract olmayan methodlardan
        // bahsetmek için concrete tabirini kullanırız

    }
    protected abstract void yakit();
    protected abstract void kaporta();
    }
