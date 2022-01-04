package findsecondlagestarray;

import java.util.Arrays;

public class SecondLarge {
    public static void main(String[] args) {
        int[] array={23,45,67,89,90};
        int size= array.length;
        Arrays.sort(array);
        int var=array[size-2];
        System.out.println("Array sorted::"+Arrays.toString(array));
        System.out.println("The second largest is::"+var);
    }
}
