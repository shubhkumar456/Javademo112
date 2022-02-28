import hashmapprogram.Hashmap;

import java.util.HashMap;

public class Occures {
    public static void main(String[] args) {
    String s = "java programing java opps";
        HashMap <Character,Integer> hmap = new HashMap<>();
        for (int i =s.length()-1; i>=0; i--){
            if (hmap.containsKey(s.charAt(i))){
                int var = hmap.get(s.charAt(i));
                hmap.put(s.charAt(i), ++var);
            }
            else {
                hmap.put(s.charAt(i),1);
            }
        }
        System.out.println(hmap);
    }
}
