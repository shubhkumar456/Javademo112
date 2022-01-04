package arrays_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("kavya");
        arr.add("tanvi");
        arr.add("kapila");
        arr.add("shinu");
        arr.add("aanya");
        System.out.println("Before sorting::"+arr);

        Collections.sort(arr);
        System.out.println("After sorting::"+arr);

    }

}
