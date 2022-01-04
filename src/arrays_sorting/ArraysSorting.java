package arrays_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysSorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("z");
        list.add("c");
        list.add("u");
        list.add("j");
        list.add("a");
        list.add("b");
        System.out.println("values before sort::"+list);
        Collections.sort(list);
        System.out.println("value after sort::"+list);

    }
}
