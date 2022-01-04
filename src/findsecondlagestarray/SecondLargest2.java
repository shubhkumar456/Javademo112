package findsecondlagestarray;

import java.util.Arrays;

public class SecondLargest2 {
    public static void main(String[] args) {
        int output[]={34,45,65,24,67,87,98,29};
        int size = output.length;
        Arrays.sort(output);
        System.out.println("Sorted array ="+Arrays.toString(output));
        int num=output[size-2];
        System.out.println("Second largest ="+num);
    }
}
