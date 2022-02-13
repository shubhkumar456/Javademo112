package hashmapprogram;

import java.util.HashMap;

public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String,String> ss=new HashMap<>();
        ss.put("A","123");
        ss.put("B","234");
        ss.put("C","567");
        ss.put("D","348");
        ss.put("E","245");

        System.out.println("Print the id of A::"+ss.get("A"));

    }
}
