import java.util.ArrayList;
import java.util.List;

public class ConcurrentM_Exception {
    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Microservices");
        list.add("Python");

        for (String obj : list){
            if (obj.equals("Java")){
                list.remove(obj);
            }
        }
    }
}
