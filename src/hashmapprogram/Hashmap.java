package hashmapprogram;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> hash = new HashMap<>();
        hash.put("a","9837");
        hash.put("b","9719");
        hash.put("c","8077");
        hash.put("d","7645");
        System.out.println(hash.get("a"));
    }
}
