package binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class Binary3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("23");
        list.add("34");
        list.add("11");
        list.add("22");
        list.add("21");

        Collections.sort(list);
        System.out.println("Sorted list::"+list);
        int findind = Collections.binarySearch(list,"34");
        System.out.println("find index::"+findind);

    }
}
