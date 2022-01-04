package removeduplicatesarraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("java");
        arr.add("shubendra");
        arr.add("shubendra");
        arr.add("gulshan");
        arr.add("gulshan");
        arr.add("subodh");
        arr.add("subodh");
        arr.add("arun");

        System.out.println("Values with duplicates::"+arr);

        LinkedHashSet<String> link = new LinkedHashSet<>();
        link.addAll(arr);
        arr.clear();
        arr.addAll(arr);
        System.out.println("values wihtout duplicates::"+link);

    }
}
