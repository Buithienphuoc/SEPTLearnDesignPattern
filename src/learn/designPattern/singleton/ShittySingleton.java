package learn.designPattern.singleton;

public class ShittySingleton {
    public static ShittySingleton instance = new ShittySingleton();
    public ShittySingleton(){}
    public String showShitColor(){
        return "yellow";
    }
}
