package binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class Binary2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("100");
        list.add("200");
        list.add("111");

        Collections.sort(list);
        System.out.println("Sorted array::"+list);
        int findindex=Collections.binarySearch(list,"111");
        System.out.println("Find index::"+findindex);

    }
}
