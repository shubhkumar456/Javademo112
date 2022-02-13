package arrays_sorting;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("java");
        arr.add("java");
        arr.add("python");
        arr.add("python");
        arr.add("html");
        arr.add("microservice");
        System.out.println("With duplicates::"+arr);

        LinkedHashSet<String> ln = new LinkedHashSet<>();
        ln.addAll(arr);
        arr.clear();
        arr.addAll(arr);
        System.out.println("Withtout duplicates::"+ln);


    }
}
