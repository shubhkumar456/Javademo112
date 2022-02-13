package arrays_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ArrSort {
    public static void main(String[] args) {
        ArrayList<String> ar= new ArrayList<>();
        ar.add("z");
        ar.add("u");
        ar.add("o");
        ar.add("i");
        ar.add("e");
        ar.add("a");
        System.out.println("before sorting::"+ar);

        Collections.sort(ar);
        System.out.println("After sorting::"+ar);

    }
}
