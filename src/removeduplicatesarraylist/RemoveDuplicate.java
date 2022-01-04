package removeduplicatesarraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Java");
        ar.add("Java");
        ar.add("Spring");
        ar.add("Spring");
        ar.add("Boot");
        ar.add("Boot");
        ar.add("Spring Boot");

        System.out.println("Values with duplicates::"+ar);

        LinkedHashSet<String> lhs =new LinkedHashSet<>();

        lhs.addAll(ar);
        ar.clear();
        ar.addAll(ar);
        System.out.println("Values without duplicates::"+lhs);
    }

}
