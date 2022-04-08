package singleton;

public class Earlyinitialization {

    public static Earlyinitialization instance = new Earlyinitialization();

    private Earlyinitialization(){
    }

    public static Earlyinitialization getInstance(){
        return instance;
    }
}