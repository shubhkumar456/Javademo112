package removeduplicatesarraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ram");
        arrayList.add("ram");
        arrayList.add("shyam");
        arrayList.add("shyam");
        arrayList.add("arjun");
        arrayList.add("arjun");
        arrayList.add("arun");

        System.out.println("values with duplicates::"+arrayList);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList);
        System.out.println("values without duplicates::"+linkedHashSet);

    }
}
