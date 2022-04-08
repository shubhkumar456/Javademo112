package singleton;

public class SingletonDemo {

    private  static  SingletonDemo instance = new SingletonDemo();
    private  SingletonDemo(){}

    public static  SingletonDemo getInstance(){
        return instance;
    }

    public void ShowSingleton(){
        System.out.println("today i submit my all documents");
    }

    public static void main(String[] args) {
        SingletonDemo obj = new SingletonDemo();
        obj.ShowSingleton();
    }
}
