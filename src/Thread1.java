public class Thread1 {

    private static Thread1 instance = null;
    private Thread1(){

    }
    public static Thread1 getInstance(){
        if (instance==null){
            instance=new Thread1();
        }
        return instance;
    }
}
