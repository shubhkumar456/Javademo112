package findsecondlagestarray;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int [] output={67,76,87,95,9,45,34,23};
        int var= output.length;
        Arrays.sort(output);
        int sum=output[var-2];
        System.out.println("Sorted aray:-"+Arrays.toString(output));
        System.out.println("Second element :-"+sum);
    }
}
