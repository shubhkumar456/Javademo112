package removeduplicatesarraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Removes {
    public static void main(String[] args) {
        ArrayList <String> arr= new ArrayList<>();
        arr.add("java");
        arr.add("java");
        arr.add("spring");
        arr.add("spring");
        arr.add("python");
        arr.add("html");
        System.out.println("With duplicates::"+arr);

        LinkedHashSet<String> ln = new LinkedHashSet<>();
        ln.addAll(arr);
        arr.clear();
        arr.addAll(arr);
        System.out.println("without duplicates::"+ln);

    }
}
