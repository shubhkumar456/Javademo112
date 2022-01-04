package findsecondlagestarray;

import java.util.Arrays;

public class SecondLargest3 {
    public static void main(String[] args) {
        int [] array ={45,67,78,89,90,54,76};
        int size= array.length;
        Arrays.sort(array);
        int num= array[size-2];
        System.out.println("Sorted array ="+Arrays.toString(array));
        System.out.println("Second Largest array ="+num);
    }
}
