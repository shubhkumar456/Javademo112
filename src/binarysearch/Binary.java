package binarysearch;

import java.util.ArrayList;
import java.util.Collections;

public class Binary {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add("1");
        list.add("10");
        list.add("12");
        list.add("112");

        Collections.sort(list);
        System.out.println("sorted array list::"+list);

        int findindex=Collections.binarySearch(list,"1");
        System.out.println("element found index::"+findindex);
    }
}
