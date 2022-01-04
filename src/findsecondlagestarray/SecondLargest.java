package findsecondlagestarray;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int array[]={10,20,89,87,67,98,85};
        int size= array.length;
        Arrays.sort(array);
        System.out.println("Sorted array "+Arrays.toString(array));
        int num = array[size-2];
        System.out.println("Second largest is ="+num);
    }
}
