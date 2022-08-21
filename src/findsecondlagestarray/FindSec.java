package findsecondlagestarray;

import java.util.Arrays;

public class FindSec {
    public static void main(String[] args) {
        int [] array={12,23,34,56,76,100};
        int size= array.length;
        Arrays.sort(array);
        int var=array[size-2];
        int car=array[size-3];
        System.out.println("sorted aaray::"+Arrays.toString(array));
        System.out.println("Duplicate is::"+var);
        System.out.printf("third is "+car);
    }
}
