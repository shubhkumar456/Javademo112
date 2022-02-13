package arrays_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("e");
        list.add("d");
        list.add("c");
        list.add("b");
        list.add("a");
        System.out.println("Before sorting::"+list);
        Collections.sort(list);
        System.out.println("After sorting::"+list);

    }
}
